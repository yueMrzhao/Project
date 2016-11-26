package mediator;

public abstract class Work {

	private Mediator mediator;
	
	public Work(Mediator mediator){
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract void work();
}
