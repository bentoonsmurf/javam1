import java.util.ArrayList;
import java.util.List;

public class PersonneDAO extends DAO<Personnel> {

	public PersonneDAO() {
		
	}
	
	public Personnel create(Personnel obj,dataService d) {
		return obj;
	}
	@Override public  Personnel find(String id,dataService d) {
		List<String> l=new ArrayList<>();
		l=d.find(id);
		
		Personnel p= new Personnel.Builder(l.get(0), l.get(1)).build();
		
		return p;
	}	

	public  Personnel update(Personnel obj ,dataService d) {
		return obj;
	}
	public  void delete(Personnel obj,dataService d) {}
}
