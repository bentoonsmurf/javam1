package calculatrice_RPN;

import java.util.Scanner;

public class SaisieRPN {
    static Scanner scanner;
	
    
	public String lire_une_entre(){
		scanner = new Scanner(System.in);
		System.out.println("Veuillez entrer une valeur puis appuyer sur ENTRER pour la valider ");
		System.out.println("(Entrer 'exite' pour arrer le programme):");
		
		return scanner.next();
		
	   }
	

}
