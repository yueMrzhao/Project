package interpreter;

public class Test {

	public static void main(String[] args) {
		//9+2-10
		int a = new Minus().interpreter(new Context(new Plus().interpreter(new Context(9,2)),10));
		System.out.println(a);
	}

}
