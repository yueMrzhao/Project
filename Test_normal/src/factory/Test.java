package factory;

public class Test {

	public static void  main(String[] args){
		Factory factory = new MailFactory();
		factory.provider().send();
	}
}
