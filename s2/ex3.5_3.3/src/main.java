import java.util.ArrayList;
		import java.util.List;

public class main {
	
	private List<RobotMobile> list_robot;
	
			void deplacer_tous(){
				int i=1;
				for(RobotMobile s : list_robot){
					System.out.println(i);
					 s.avance();
					 i++;
				}
				
			}
			
			public main() {
			this.list_robot= new ArrayList<RobotMobile>();
			}
	public static void main(String[] args) {
	 
		RobotMobile r= new RobotMobile();
		RobotStatique r2= new RobotStatique();
			main m=new main();
			m.list_robot.add(r);
			
			m.deplacer_tous();

			
			
			
		
	}

}
