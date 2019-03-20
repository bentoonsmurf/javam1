import java.util.ArrayList;
	import java.util.List;

public class GroupeDAO extends DAO<PersonnelGroup> {
	
	public GroupeDAO() {
		
	}
	

	public PersonnelGroup create(PersonnelGroup obj,dataService d) {
		return obj;
	}
	@Override public  PersonnelGroup find(String id,dataService d) {
		List<String> l=new ArrayList<>();
		l=d.find(id);
		
		PersonnelGroup p= new PersonnelGroup(l.get(1));
		
		return p;
	}	

	public  PersonnelGroup update(PersonnelGroup obj ,dataService d) {
		return obj;
	}
	public  void delete(PersonnelGroup obj,dataService d) {}
}

	
