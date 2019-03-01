
public class Main {

	
	public static void main(String[] args) {
		DAO<Personnel> PersonneDao = new PersonneDAO();
		dataService d=new dataService();
		System.out.println(d.getname());
		System.out.println(PersonneDao.find("mot3",d));
		
	
	}

}
