import java.util.ArrayList;
 


public class Dossier extends superclass{
	
	private ArrayList<superclass> liste;
	//al = new ArrayList();
	
	public Dossier() {
		this.nom="";
		this.liste= new ArrayList();
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

    
	
}
