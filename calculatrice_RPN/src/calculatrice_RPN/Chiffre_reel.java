package calculatrice_RPN;

public class Chiffre_reel extends element{
	
	private double val;
	private static Chiffre_reel  max =new Chiffre_reel(Double.MAX_VALUE);
	private static Chiffre_reel  min =new Chiffre_reel(Double.MIN_VALUE);
	
	
	public Chiffre_reel() {
		this.val=0;
		
		
	}
	
	public Chiffre_reel(double a) {
		this.val=a;
		
		
	}
	
	
}
