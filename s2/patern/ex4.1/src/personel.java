import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class personel {
	private final String prenom;
	private final String nom;
	private final LocalDate date_de_naissance;
	private final List<String> num_tel;
	private final List<personel> subordoné;
	
	public static class builder{
			final String prenom;
			final String nom;
			final LocalDate date_de_naissance;
			final List<String> num_tel;
			final List<personel> subordoné;
			
		
		public builder() {
			this.nom="";
			this.prenom="";
			this.date_de_naissance=java.time.LocalDate.now();
			this.num_tel=null;
			this.subordoné=null;
		}
		public builder(String nom, String prenom,List<String> num, List <personel> subordoné) {
			this.nom=nom;
			this.prenom=prenom;
			this.date_de_naissance=java.time.LocalDate.now();
			this.num_tel=num;
			this.subordoné=subordoné;
		}
		
	}
	
	
	public personel(builder b) {
		this.nom=b.nom;
		this.prenom=b.prenom;
		this.date_de_naissance=b.date_de_naissance;
		this.num_tel=b.num_tel;
		this.subordoné=b.subordoné;
	}
	
	
}
