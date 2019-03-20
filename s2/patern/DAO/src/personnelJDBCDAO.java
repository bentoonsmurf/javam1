
import java.util.ArrayList;
import java.util.List;
//ecrire dirrectement les requettes sql ici 

public class personnelJDBCDAO extends DAO<Personnel> {

	public personnelJDBCDAO() {
		
	}
	
	public Personnel create(Personnel obj,dataService d) {
		return obj;
	}
	@Override public  Personnel find(String id,dataService d) {
		List<String> l=new ArrayList<>();
		//connexion base de donnée 
		l=null;
		
		Personnel p= new Personnel.Builder(l.get(0), l.get(1)).build();
		
		return p;
	}	

	public  Personnel update(Personnel obj ,dataService d) {
		return obj;
	}
	public  void delete(Personnel obj,dataService d) {}
}
