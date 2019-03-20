// recree la factory et les deux DAO pour le jdbc
public class Main {

	
	public static void main(String[] args) {
		DAO<Personnel> PersonneDao = new PersonneDAO();
		dataService d=new dataService();
		System.out.println(d.getFileName()+"\n");
		System.out.println(PersonneDao.find("mot3",d));
		
	
	}

}
