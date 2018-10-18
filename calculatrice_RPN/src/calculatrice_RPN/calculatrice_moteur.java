package calculatrice_RPN;

import java.util.Stack;

public class calculatrice_moteur {
	
	private Stack<element> pile;
	
	public calculatrice_moteur() {
		this.pile = new Stack<element>();
		
	}// push(E)  pop()   peek() 
	
	public float executer_calcul() {
		
		
		
		
		return 0;
	}
	
	public float eval (float a1,float a2 ,operation op) {
		
		if (op==operation.plus) return a1 + a2;
		if (op==operation.moins) return a1 - a2;
		if (op==operation.mult) return a1 * a2;
		if (op==operation.div) return a1 / a2;
		return 0;
	}
}
