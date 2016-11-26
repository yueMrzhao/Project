package observer;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {


	@Override
	public void update(Observable o, Object arg) {
		System.out.println("这是第"+(Integer)arg+"次看表演了！");
	}
}
