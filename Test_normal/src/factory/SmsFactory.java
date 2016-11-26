package factory;

public class SmsFactory implements Factory {

	@Override
	public SmsSender provider() {
		return new SmsSender();
	}

}
