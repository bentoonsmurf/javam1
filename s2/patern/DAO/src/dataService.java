import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class dataService {
	 private List<String> info;
	 private String fichierSauvergardeName;
	 
	 public dataService() {
		 this.info=new ArrayList<>();
		 this.fichierSauvergardeName="/home/user/Bureau/javam1/s2/patern/DAO/src/save.txt";
	 }
	 public String getFileName() {
		 return this.fichierSauvergardeName;
	 }
	 
	 public List<String> find(String id) {
		 
		 try{//"this.fichierSauvergardeName"
			 InputStream flux=new FileInputStream(this.fichierSauvergardeName); 
			 InputStreamReader lecture=new InputStreamReader(flux);
			 BufferedReader buff=new BufferedReader(lecture);
			 String ligne;
			 while ((ligne=buff.readLine())!=null){
			 	System.out.println(ligne);
			 	String[] words = ligne.split(" ");
			 	if (words[0].equals(id)) {
			 		this.info.add(words[0]);
			 		this.info.add(words[1]);
			 	}
			 	
			 	
			 }
			 buff.close(); 
			 }		
			 catch (Exception e){
				 System.out.println(e.toString());
			 }
		 
		return this.info;
	 }

	
}
