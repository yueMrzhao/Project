package thread;

public class Test {

	public static void main(String[] args){
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread1.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("1111");
				
			}
		};
		
		Runnable runnable2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("2222");
				
			}
		};
		
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		Thread3 thread3 = new Thread3();
		
		thread1.start();
		thread2.start();
		thread3.run();
		runnable.run();
		runnable2.run();
	}
}
