package calculatrice_RPN;

import java.util.EmptyStackException;
import java.util.Scanner;

public class SaisieRPN {
    static Scanner scanner;
	public MoteurRPN moteur;
	double a,b;
	
	public void recuperer_donnees() throws ExceptionNombreNonValide{
		String str;
		scanner = new Scanner(System.in);
		moteur= new MoteurRPN();
		boolean first_scan=false;
		
		System.out.println("Veuillez entrer une valeur et  appuyer sur ENTRER pour  valider ");
		System.out.println("(Entrer 'exit' pour arreter le programme):");
		str=scanner.nextLine();
		
		
		while(str!="exit"){	//tant que l'utilisateur entre un élément différent de "exit"
			//throws ExceptionNombreNonValide
			
			try{
				if(str.length()==0 )
					throw new StringIndexOutOfBoundsException();
				
				if(isDouble(str)){ // si la valeur entrée est un double
					
					ajouter_operande(Double.parseDouble( str ));
					
				}		
				
				else if(str.charAt(0)=='+'||str.charAt(0)=='-'||str.charAt(0)=='*'||str.charAt(0)=='/'){ //si la valeur entrée est parmis les 4 opérations acceptées								
					
					calcul(str.charAt(0));				
				
					moteur.afficher_Operandes();	
					
				}
				
				
				else{ // si l'utilisateur entre une valeur non autorisée
					System.out.println("Caractère non supporté! Veuillez svp entrer un nombre ou un caractère autorisé. \n");
				
				}
				
			}
			catch(StringIndexOutOfBoundsException e){
				System.out.println("Aucune valeur n'est entrée \n");
				
			}
			/*if(isDouble(str)){ // si la valeur entrée est un double
				
				ajouter_operande(Double.parseDouble( str ));
				
			}		
			
			else if(str.charAt(0)=='+'||str.charAt(0)=='-'||str.charAt(0)=='*'||str.charAt(0)=='/'){ //si la valeur entrée est parmis les 4 opérations acceptées								
				
				calcul(str.charAt(0));				
			
				moteur.afficher_Operandes();	
				
			}
			
			
			else{ // si l'utilisateur entre une valeur non autorisée
				System.out.println("Caractère non supporté! Veuillez svp entrer un nombre ou un caractère autorisé. \n");
			
			}
			str=scanner.nextLine();*/
			str=scanner.nextLine();
		}
		
	}
	
	
	
	
	
		////////////////////ajouter l'opérande à la pile tout en vérifiant s'il appartient à l'intervale imposé
		
	 	public void ajouter_operande(double nombre) throws ExceptionNombreNonValide{

			try 
			
			{  
				if (nombre< moteur.MIN_VALUE || nombre> moteur.MAX_VALUE) 
					throw new ExceptionNombreNonValide(); 
				else	 
		 	moteur.empiler_chiffre(nombre); // l'ajouter à la pile
				} 
			catch (ExceptionNombreNonValide  e) 
			{  
				
			} 
	 		 
			moteur.afficher_Operandes();
	 	}
	 	
	 	
	 	
	 	
	 	
	 	////////////Effectue le calcule en s'assurant que la pile n'est pas vide
	 	public void calcul(char c) throws EmptyStackException{
	 		double result;
	 		try {
	 			moteur.symbole=c; // modifier la valeur du symbole
	 			if(moteur.pile.size()<2)// si la pile contient moins de 2 valeurs
	 				throw new EmptyStackException();
	 			
		         a=moteur.pile.pop();
		         b=moteur.pile.pop();
		         result=moteur.eval(b,a);
		         try {
		           		 if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY)
		                     throw new ArithmeticException();
		           		moteur.pile.push(result); // effectuer l'opération avec les deux premiers éléments de la pile puis mettre le résultat dans la pile
				        System.out.println("opération effectuée : "+ c);
		             
		         } catch (ArithmeticException ae) {
		             System.out.println("ArithmeticException occured!");
		         }
		          
		      } catch (EmptyStackException e) {
		    	  
		         System.out.println("Vous n'avez pas assez d'opérandes pour effectuer l'opération");
		         
		      }
	 	}
	 	
	 	
	 	
	 	
	 	/////////////vérifie si un nombre est un double ou pas//////////////////////////
	    public boolean isDouble( String str ){
	        try{
	            Double.parseDouble( str );
	            return true;
	        }
	        catch( Exception e ){
	            return false;
	        }
	    }

}
