package calculatrice_RPN;

import java.util.EmptyStackException;
import java.util.Scanner;

public class SaisieRPN {
    static Scanner scanner;
	MoteurRPN moteur;
	
	public void recuperer_donnees(){
		String str;
		double a,b;
		scanner = new Scanner(System.in);
		moteur= new MoteurRPN();
		System.out.println("Veuillez entrer une valeur puis appuyer sur ENTRER pour la valider ");
		System.out.println("(Entrer 'exite' pour arrer le programme):");
		str=scanner.nextLine();
		
		
		while(str!="exit"){	//tant que l'utilisateur entre un élément différent de "exit"
			
			
			if(isDouble(str)){ // si la valeur entrée est un double
				
				moteur.pile.push(Double.parseDouble( str )); // l'ajouter à la pile
				moteur.afficher_Operandes();
				
			}
			
			
			
			else if(str.charAt(0)=='+'||str.charAt(0)=='+'||str.charAt(0)=='*'||str.charAt(0)=='/'){ //si la valeur entrée est parmis les 4 opérations acceptées
								
				moteur.symbole=str.charAt(0); // modifier la valeur du symbole
				
				try {
					
			         a=moteur.pile.pop();
			         b=moteur.pile.pop();
			         moteur.pile.push(moteur.eval(a, b)); // effectuer l'opération avec les deux premiers éléments de la pile puis mettre le résultat dans la pile
			         
			      } catch (EmptyStackException e) {
			    	  
			         System.out.println("Vous n'avez pas assez d'opérandes pour effectuer l'opération");
			         
			      }
			
				System.out.println("opération effectuée : "+ str.charAt(0)); 
				moteur.afficher_Operandes();	
				
			}
			
			
			else{ // si l'utilisateur entre une valeur non autorisée
				System.out.println("caractère non supporté! Veuillez svp entre un nombre ou un caractère autorisé. \n");
			
			}
			str=scanner.nextLine();
		}
		
	}
		
		
	 
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
