package facade;

public class Computer {
	
	private Cache cache;
	
	private Cpu cpu;
	
	public Computer(){
		cache = new Cache();
		
		cpu = new Cpu();
	}

	public void startUp(){
		cache.startUp();
		cpu.startUp();
	}
	
	public void shutDown(){
		cache.startUp();
		cpu.shutDown();
	}
}
