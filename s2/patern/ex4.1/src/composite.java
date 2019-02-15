
public abstract class composite {

	
	

	
	void parcourProfondeur(personel p) {
		System.out.println(p.getNom());
	}
	void parcourProfondeur(groupe_de_personne g) {
		int i=0;
		while (i<g.getSubordoné().size()) {
			parcourProfondeur(g.getSubordoné().get(i));
			i++;
		}
	}
	
}
