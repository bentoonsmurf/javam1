import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Création d'un dossier
		Dossier doc= new Dossier("doc");
		
		//Création d'un fichier
		Fichier fichier1= new Fichier("fichier1",14);
		doc.add(fichier1); // ajout du fichier au dossier
		
		System.out.println(fichier1.getTaille());
		System.out.println(doc.getTaille());
		doc.add(doc);
		
		//création et ajout d'un nouveau document à doc
		Dossier document= new Dossier("document");
		document.add(document);
		doc.add(document);
		//document.add(fichier1);
		document.add(doc);

		
		
	}

}
