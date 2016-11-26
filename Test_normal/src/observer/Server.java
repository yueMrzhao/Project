package observer;

public interface Server {

	public void add(Observer observer);
	
	public void remove(Observer observer);
	
	public void notifyClient();
	
	public void operate();
}
