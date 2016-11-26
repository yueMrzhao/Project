package observer;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public abstract class ServerAbstract implements Server {

	Vector<Observer> vector = new Vector<Observer>();
	
	public void add(Observer observer){
		vector.add(observer);
	}
	
	public void remove(Observer observer){
		vector.remove(observer);
	}
	
	public void notifyClient(){
		Iterator<Observer> iterator =vector.iterator();
		while(iterator.hasNext()){
			Observer aa = iterator.next();
			aa.pushMessage();
		}
	}
	
	public void notifyClient1(){
		Enumeration<Observer> item = vector.elements();
		while(item.hasMoreElements()){
			item.nextElement().pushMessage();
		}
		
	}
	
	

}
