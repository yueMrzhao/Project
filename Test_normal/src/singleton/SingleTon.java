package singleton;

public class SingleTon {
 
	private static SingleTon instance = null;
	
	private SingleTon(){
		System.out.println("hello world!");
	}
	
	private static class SingleTonFactory{
		private static SingleTon instance1 = new SingleTon();
	}
	
	public static SingleTon getInstance(){
		return SingleTonFactory.instance1;
	}
}
