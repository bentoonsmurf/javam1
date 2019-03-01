
public class serializableDAOFactory {

	public static 	DAO<Personnel> getPersonneDAO(){
		return new PersonneDAO();
	}
	
}
