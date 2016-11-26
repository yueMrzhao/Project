package builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {

	private static List<Sender> list = new ArrayList<Sender>();
	
	public static void create1(int i) {
		for (int j = 0 ; j < i ; j ++) {
			list.add(new MailSender());
			System.out.println("这是第"+(j+1)+"次添加");
		}
	}
	
	public static void create2(int i) {
		for (int j = 0 ; j < i ; j ++) {
			list.add(new SmsSender());
		}
	}
}
