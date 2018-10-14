import java.util.ArrayList;
 


public class Dossier extends superclass{
	
	private ArrayList<superclass> liste;

	
	public int explore() {
		return 1;
	}
	
	
	public Dossier() {
		this.nom="";
		this.liste= new ArrayList<superclass>();
	}
	
	
	public void add(superclass d) {
		this.liste.add(d);
		
	}
	
	
	public int explore(superclass d) {
		
		return 1;
		
	}
	
	public int getTaille() {
		int somme=0;
		for(int i = 0; i <this.liste.size(); i++){
			somme = somme +this.liste.get(i).getTaille();	
		}   
		return somme;
	}

    public boolean verifProblem(superclass d) {
    	
    	if (this == d)
    		return true;
    	else 
    		return false;
    }
    
    // verifie que tout les element du dossier ne sont pas le dossier lui meme
	public boolean verifintern () {
		
			boolean somme=false;
			for(int i = 0; i <this.liste.size(); i++){
				somme = somme && this.liste.get(i).verifProblem(this);	
			}   
			return somme;
		
	}
	
	// je me base sur le fait que je sait que j'ai un dossier 
	// meme si je fait mes operation sur un objet superclass
	public boolean recursive (superclass d) { // dossier a verifier
		
		boolean somme=false;
		for(int i = 0; i <this.liste.size(); i++){
			somme = somme && this.liste.get(i).verifProblem(this) && this.liste.get(i).recursive(d);	
		}   
		return somme;
	
}
	
}
