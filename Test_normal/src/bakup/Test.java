package bakup;

public class Test {

	public static void main(String[] argus){
		System.out.println("==================初始化======================");
		Orginial orginial = new Orginial("棋棋");
		System.out.println(orginial.getValue());
		Stroge stroge = new Stroge(orginial.createBakup());
		System.out.println("==================值改变======================");
		orginial.setValue("小宝");
		System.out.println(orginial.getValue());
		System.out.println("==================还原======================");
		orginial.restoreBakup(stroge.getBakup());
		System.out.println(orginial.getValue());
	}
	
}
