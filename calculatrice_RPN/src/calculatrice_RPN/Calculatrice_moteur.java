package calculatrice_RPN;

import java.util.Stack;

public class calculatrice_moteur extends Operation{
	
	private Stack<element> pile;
	
	public calculatrice_moteur() {
		this.pile = new Stack<element>();
		
	}// push(E)  pop()   peek() 
	
	public void empiler_chiffre(chiffre_reel c) {
		
		this.pile.push(c);
	}

	
	public float eval (float a1,float a2 ,operation op) {
		
		if (op==operation.plus) return a1 + a2;
		if (op==operation.moins) return a1 - a2;
		if (op==operation.mult) return a1 * a2;
		if (op==operation.div) return a1 / a2;
		return 0;
	}

	double eval(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	double evalPlus(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	double evalMoins(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	double evalMult(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	double evalDiv(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
