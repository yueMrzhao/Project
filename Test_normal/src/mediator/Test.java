package mediator;

public class Test {

	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createWork();
		mediator.workAll();
	}

}
