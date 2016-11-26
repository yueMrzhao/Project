package proxy;

public class ProxySource implements Sourceable {

	private Source source;
	
	public ProxySource(){
		this.source = new Source();
	}
	
	@Override
	public void method(){
		this.before();
		this.source.method();
		this.after();
	}
	
	public void after(){
		System.out.println("after");
	}
	
	public void before(){
		System.out.println("before");
	}
}
