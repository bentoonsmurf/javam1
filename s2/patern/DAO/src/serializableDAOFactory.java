
public class serializableDAOFactory {

	public static 	DAO<Personnel> getPersonneDAO(){
		return new PersonneDAO();
	}
	public static 	DAO<PersonnelGroup> getPersonnelGroupeDAO(){
		return new GroupeDAO();
	}
	
}
