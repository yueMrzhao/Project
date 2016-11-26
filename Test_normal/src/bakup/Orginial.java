package bakup;

public class Orginial {

	private String value;
	
	public Orginial(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Bakup createBakup() {
		return new Bakup(this.value);
	}
	
	public void restoreBakup(Bakup bakup) {
		this.value = bakup.getValue();
	}
}
