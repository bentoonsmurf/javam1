package calculatrice_RPN;

import java.util.Stack;

public class MoteurRPN extends Operation{
	
	final double MAX_VALUE=100;
	final double MIN_VALUE=1;
	
	private Stack<Double> pile;
	
	public MoteurRPN() {
		super('A');
		this.pile = new Stack<Double>();
		
	}// push(E)  pop()   peek() 
	
	public void empiler_chiffre(double c) {
		
		this.pile.push(c);
	}

	
	/*public float eval (float a1,float a2 ,operation op) {
		
		if (op==operation.plus) return a1 + a2;
		if (op==operation.moins) return a1 - a2;
		if (op==operation.mult) return a1 * a2;
		if (op==operation.div) return a1 / a2;
		return 0;
	}*/

	double eval(double a, double b, char c) {
		
		/*if (c==PLUS)
			pile.push(evalPlus( a,  b));
		if (c==MOINS)
			pile.push(evalMoins( a,  b));
		if (c==MOINS)
			pile.push(evalMoins( a,  b));*/
		
		return 0;
	}

	double evalPlus(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	double evalMoins(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	double evalMult(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	double evalDiv(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}
}
