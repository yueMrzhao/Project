package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest {

	public static void main(String[] argus) {
		
		ExecutorService executorService= Executors.newFixedThreadPool(10);
		List<Future<?>> list = new ArrayList<Future<?>>();
		for(int i=0;i<10;i++){
		Callable callable = new MyCallable(i+"");
		Future future = executorService.submit(callable);
		list.add(future);
		}
		executorService.shutdown();
		
		for (Future future: list){
			try {
				System.out.println((String)future.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
