package calculatrice_RPN;

import java.util.Stack;

public class MoteurRPN extends Operation{
	
	final double MAX_VALUE=100;
	final double MIN_VALUE=1;

	
	private Stack<Double> pile;
	
	//Pile pile = new Pile(); 

	//Object pile1=1; 
	try
		{ 
		  if (isPileVide()) 
		  	{
	            System.out.println("Impossible de faire une operation car la pile est vide");
	           System.exit(-1); 
	        }
		} 

	catch (ExceptionPileVide v)
		{ 
			System.out.println("La pile est vide"+v); 
		} 
	
	
	
	public MoteurRPN() {
		super(' ');
		this.pile = new Stack<Double>();
		
	}// push(E)  pop()   peek() 
	
	public void empiler_chiffre(double c) {
		try 
		
		{  
		 	 if (c < this.MIN_VALUE || c > this.MAX_VALUE) 
			{  
				//throw new ExceptionNombreNonValide("bad value"); 
			}  
			this.pile.push(c);
		} 
		catch (NumberFormatException e) 
		{  
			// encapsulation de l'exception  
			//throw new ExceptionNombreNonValide("parse error"); 
		}  
		
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
