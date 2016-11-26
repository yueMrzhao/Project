package adapter;

public class Wapper implements TargetTable {

	private Source source;
	
	public Wapper(){
		source = new Source();
	}
	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("wapper method2!");
	}

}
