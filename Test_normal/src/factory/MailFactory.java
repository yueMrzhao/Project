package factory;

public class MailFactory implements Factory {

	@Override
	public MailSender provider() {
		return new MailSender();
	}

}
