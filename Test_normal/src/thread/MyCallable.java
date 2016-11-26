package thread;

import java.util.Date;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Object>{

	private String count;
	
	public  MyCallable(String count) {
		this.count = count;
	}
	
	@Override
	public Object call() throws Exception {
		System.out.println("====================第"+count+"程序开始运行：");
		Date date = new Date();
		Thread.sleep(1000);
		System.out.println("nihao");
		Date date1 = new Date();
		long time = date1.getTime() - date.getTime();
		System.out.println("=====================第"+count+"程序终止！");
		return "第"+count+"任务共花费："+time+"毫秒的时间！";
	}

}
