package mediator;

public class MyMediator implements Mediator {
	
	private Work work1;
	
	private Work work2;

	@Override
	public void createWork() {
		work1 = new Work1(this);
		work2 = new Work2(this);
	}

	@Override
	public void workAll() {
		work1.work();
		work2.work();
	}

	public Work getWork1() {
		return work1;
	}

	public void setWork1(Work work1) {
		this.work1 = work1;
	}

	public Work getWork2() {
		return work2;
	}

	public void setWork2(Work work2) {
		this.work2 = work2;
	}
	
	

}
