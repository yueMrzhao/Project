package observer;

import java.util.Observer;

public class WatchTest {

	public static void main(String[] argus){
		Observer watcher = new Watcher();
		Player observable = new Player();
		observable.addObserver(watcher);
		observable.count(10);
	}
}
