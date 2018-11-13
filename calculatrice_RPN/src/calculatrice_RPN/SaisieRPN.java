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
		
		System.out.println("Veuillez entrer une valeur puis appuyer sur ENTRER pour la valider ");
		System.out.println("(Entrer 'exit' pour arrer le programme):");
		str=scanner.nextLine();
		
		
		while(str!="exit"){	//tant que l'utilisateur entre un élément différent de "exit"
			//throws ExceptionNombreNonValide
			
			if(isDouble(str)){ // si la valeur entrée est un double
				
				ajouter_operande(Double.parseDouble( str ));
				
			}		
			
			else if(str.charAt(0)=='+'||str.charAt(0)=='-'||str.charAt(0)=='*'||str.charAt(0)=='/'){ //si la valeur entrée est parmis les 4 opérations acceptées								
				
				calcul(str.charAt(0));				
			
				System.out.println("opération effectuée : "+ str.charAt(0)); 
				moteur.afficher_Operandes();	
				
			}
			
			
			else{ // si l'utilisateur entre une valeur non autorisée
				System.out.println("caractère non supporté! Veuillez svp entrer un nombre ou un caractère autorisé. \n");
			
			}
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
	 	public void calcul(char c){
	 		try {
	 			moteur.symbole=c; // modifier la valeur du symbole
		         a=moteur.pile.pop();
		         b=moteur.pile.pop();
		         moteur.pile.push(moteur.eval(b,a)); // effectuer l'opération avec les deux premiers éléments de la pile puis mettre le résultat dans la pile
		         
		      } catch (NullPointerException e) {
		    	  
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
