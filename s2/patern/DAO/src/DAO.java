
public abstract class DAO<T> {
	
	public abstract T create(T obj,dataService d);
	public abstract T find(String id,dataService d);
	public abstract T update(T obj ,dataService d);
	public abstract void delete(T obj,dataService d);
}
