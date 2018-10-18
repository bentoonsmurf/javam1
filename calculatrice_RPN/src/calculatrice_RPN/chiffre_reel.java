package calculatrice_RPN;

public class chiffre_reel extends element{
	
	private float val;
	private static chiffre_reel  max =new chiffre_reel(Float.MAX_VALUE);
	private static chiffre_reel  min =new chiffre_reel(Float.MIN_VALUE);
	
	
	public chiffre_reel() {
		this.val=0;
		
		
	}
	
	public chiffre_reel(float a) {
		this.val=a;
		
		
	}
	
	
}
