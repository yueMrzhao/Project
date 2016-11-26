package observer;

public class Test {

	public static void main(String[] argus){
		Server server = new MyServer();
		Client1 client1 = new Client1();
		Client2 client2 = new Client2();
		server.add(client1);
		server.add(client2);
		server.operate();

	}
}
