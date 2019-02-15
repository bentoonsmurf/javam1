
import java.util.List;

public class groupe_de_personne extends composite{

	private final List<personel> groupe;
	
	public groupe_de_personne() {
		this.groupe=null;
	}
	
	public List<personel> getSubordoné() {
		return groupe;
	}
	
}
