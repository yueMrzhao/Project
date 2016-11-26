package observer;

public class Client1 implements Observer {

	@Override
	public void pushMessage(){
		System.out.println("client1 has pushed!");
	}
}
