package template;

public class Calculator1 extends AbstractCalculator implements Icalculator{


	@Override
	public void calucator(String exp) {
		int[] aa = super.split(exp, "\\+");
		System.out.println(aa[0]+aa[1]);
	}

}
