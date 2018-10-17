
public abstract class superclass {
	String nom;	
	superclass parent;
		
	public superclass(String nom) {
		this.nom=nom;
		this.parent=null;
	}
	
	//public abstract int explore();
	
	public abstract int getTaille();
	public abstract boolean verifProblem(superclass s);
	//public abstract boolean recursive (superclass d) ;
	
}
