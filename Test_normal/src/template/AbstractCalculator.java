package template;

public abstract class AbstractCalculator {

	
	public int[] split(String exp,String spiltExp){
		int[] list = new int[2];
		String[] aa = exp.split(spiltExp);
		list[0] = Integer.parseInt(aa[0]);
		list[1] = Integer.parseInt(aa[1]);
		return list;
	}
}
