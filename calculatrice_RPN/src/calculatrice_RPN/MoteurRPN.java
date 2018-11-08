package calculatrice_RPN;

import java.util.Stack;

public class MoteurRPN extends Operation{
	
	final double MAX_VALUE=100;
	final double MIN_VALUE=1;

	
	private Stack<Double> pile;
	
	public MoteurRPN() {
		super('+');
		this.pile = new Stack<Double>();
		
	}// push(E)  pop()   peek() 
	
	public void empiler_chiffre(double c) {
		
		this.pile.push(c);
	}

	
	public double eval (double a1,double a2 , Operation op) {
		
		if (op.symbole==op.PLUS) return a1 + a2;
		if (op.symbole==op.MOINS) return a1 - a2;
		if (op.symbole==op.MULT) return a1 * a2;
		if (op.symbole==op.DIV) return a1 / a2;
		return 0;
	}

	public void afficher_Operandes(){
		System.out.println("Opérandes Stockées: " + pile);
		
	}


	
}
