package factory;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("我是sm 发送者，现在发送！");
	}

}
