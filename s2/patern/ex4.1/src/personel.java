import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class personel extends composite{
	private final String prenom;
	private final String nom;
	private final LocalDate date_de_naissance;
	private final List<String> num_tel;
	private final List<personel> subordoné;
	private final String departement;	
	
	public static class builder{
			final String prenom;
			final String nom;
			final LocalDate date_de_naissance;
			final List<String> num_tel;
			final List<personel> subordoné;
			final String departement;	
			
		
		public builder() {
			this.nom="";
			this.prenom="";
			this.date_de_naissance=java.time.LocalDate.now();
			this.num_tel=null;
			this.subordoné=null;
			this.departement="";	
			
		}
		public builder(String nom, String prenom,List<String> num, List <personel> subordoné, String departement) {
			this.nom=nom;
			this.prenom=prenom;
			this.date_de_naissance=java.time.LocalDate.now();
			this.num_tel=num;
			this.subordoné=subordoné;
			this.departement=departement;	
			
		}
		public personel build() {
			return new personel(this);
		}
	}
	
	
	public personel(builder b) {
		this.nom=b.nom;
		this.prenom=b.prenom;
		this.date_de_naissance=b.date_de_naissance;
		this.num_tel=b.num_tel;
		this.subordoné=b.subordoné;
		this.departement=b.departement;
	}

	

	public String getPrenom() {
		return prenom;
	}

	public String getNom() {
		return nom;
	}

	public LocalDate getDate_de_naissance() {
		return date_de_naissance;
	}

	public List<String> getNum_tel() {
		return num_tel;
	}

	public List<personel> getSubordoné() {
		return subordoné;
	}
	public String getDepartement() {
		return departement;
	}
	
	
}
