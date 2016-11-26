package observer;

import java.util.Observable;

public class Player extends Observable {

	public void count(int i){
		for(;i>0;i--){
			super.setChanged();
			super.notifyObservers(i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println("sleep has been interrupeted");
			}
			
		}
	}
}
