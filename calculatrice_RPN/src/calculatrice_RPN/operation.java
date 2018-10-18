package calculatrice_RPN;


// il manque extends element 
public enum operation {// enum =Class avec un nombre d'instances limité
	plus,
	moins,
	mult,
	div;
	
	private String symbole;
	
	
	private operation() {	
		this.symbole =null;	
	}
	
	private operation(String s) {
		
		this.symbole =s;
		
	}
	
}
