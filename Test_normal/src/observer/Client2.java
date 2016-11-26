package observer;

public class Client2 implements Observer {

	@Override
	public void pushMessage(){
		System.out.println("client2 has pushed!");
	}
}
