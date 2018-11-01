package calculatrice_RPN;


// il manque extends element 
public abstract class Operation extends element {// enum =Class avec un nombre d'instances limité
	// déclaration des constantes
	final char PLUS='+';
	final char MOINS='-';
	final char MULT='*';
	final char DIV='/';
	
	private String symbole;
	
	
	/*private Operation() {	
		this.symbole =null;	
	}
	*/
	private Operation(String s) {
		
		this.symbole =s;
		
	}
	
	abstract double eval(double a, double b);
	abstract double evalPlus(double a, double b);
	abstract double evalMoins(double a, double b);
	abstract double evalMult(double a, double b);
	abstract double evalDiv(double a, double b);
}
