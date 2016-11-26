package factory;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("我是mail发送者，现在发送！");
	}

}
