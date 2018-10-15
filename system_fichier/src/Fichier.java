import java.util.ArrayList;


public class Fichier extends superclass{

	private int taille;
	
	
	Fichier(String nom, int taille){
		this.nom=nom;
		this.taille=taille;
	}
	 public int explore() {
		 return 1;
		 
	 }
	 
	 public int getTaille() {
		 return this.taille;
		 
	 }
	 
	 public  boolean verifProblem(superclass b){
		 return false;
	 }
	
}
