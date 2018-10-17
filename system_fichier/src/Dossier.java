import java.util.ArrayList;
 


public class Dossier extends superclass{
	
	private ArrayList<superclass> liste;

	
	public int explore() {
		return 1;
	}
	
	
	Dossier(String nom) {
		super(nom);
		this.liste= new ArrayList<superclass>();
	}
	
	public void add(superclass d) {
		if (verifProblem(d)==true)
			 System.out.println("Cette opération ne peut aboutir. Le dossier ne peut être créé dans lui même");
		else if (verif_parents(d)==true)
			System.out.println("Cette opération ne peut aboutir. Le dossier ne peut être créé dans un de ses fils");
		else{
			d.parent=this;
			this.liste.add(d);
			
		}
		
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
     
    // verifie que tout les elements du dossier ne sont pas le dossier lui meme
	public boolean verifintern () {
		
			boolean somme=false;
			for(int i = 0; i <this.liste.size(); i++){
				somme = somme && this.liste.get(i).verifProblem(this);	
			}   
			return somme;
		
	}
	
	// je me base sur le fait que je sait que j'ai un dossier 
	// meme si je fait mes operation sur un objet superclass
	/*public boolean recursive (superclass d) { // dossier a verifier
		
		boolean somme=false;
		for(int i = 0; i <this.liste.size(); i++){
			somme = somme && this.liste.get(i).verifProblem(this) && this.liste.get(i).recursive(d);	
		}   
		return somme;
	
	}*/
	
	public boolean verif_parents (superclass d) { // ajout d'un pointeur parentns à la classe et chaque element va pointer sur son parent ou sur null

		boolean somme=false;
		superclass temp;
		
		temp=this.parent;
			
		while(temp!=null){
			
			if(temp==d)
				somme= true;
			else
				temp=temp.parent;
					
		}
		return somme;
	}

	
}
