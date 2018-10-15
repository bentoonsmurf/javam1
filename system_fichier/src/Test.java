import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dossier doc= new Dossier("Doc");
		Fichier fichier1= new Fichier("fichier1",14);
		doc.add(fichier1);
		System.out.println(fichier1.getTaille());
		System.out.println(doc.getTaille());
		
		/*
	    ArrayList al = new ArrayList();
	    Dossier d= new Dossier();
	   
	    
	    
	    for(int i = 0; i < al.size(); i++)
	    {
	      System.out.println("donnée à l'indice " + i + " = " + al.get(i));
	    }   */
		
		
		
	}

}
