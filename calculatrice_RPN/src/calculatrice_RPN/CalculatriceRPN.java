package calculatrice_RPN;


public class CalculatriceRPN {
	
	
	
	public static void main(String args[]) {
		
		SaisieRPN s = new SaisieRPN();
		MoteurRPN m = new MoteurRPN();
		
		String toute_l_operation="";
		String entre=""; 
		double D_entre;
		double op1;
		double op2;
		
		while(entre != "exit") {
			entre= s.lire_une_entre();
			
			if (entre =="+" ||entre =="-" || entre =="*" || entre =="/" ) {
				op1 = m.pile.pop();
				op2 = m.pile.pop();
				m.symbole= entre.charAt(0);// car symbole est un char
				m.eval(op1, op2);
				
			}
			else { // entre est un nombre
				
				
				D_entre = Double.parseDouble(entre);
				m.pile.push(D_entre);
			}
			toute_l_operation=toute_l_operation + " " + "entre";
		}
		System.out.println("vous avez entre :" + toute_l_operation);
		System.out.println("le resultat est " + m.pile.peek());
	   }
	
	
	

}
