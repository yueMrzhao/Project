package builder;

public class MailSender implements Sender {
	
	public MailSender(){
		System.out.println("新建对象");
	}

	@Override
	public void send() {
		System.out.println("我是mail发送者，现在发送！");
	}

}
