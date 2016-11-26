package observer;

public class MyServer extends ServerAbstract  {

	@Override
	public void operate(){
		System.out.println("update begin!");
		super.notifyClient();
	}
}
