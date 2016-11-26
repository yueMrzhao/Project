package interpreter;

public class Minus implements Interpreter {

	@Override
	public int interpreter(Context context) {
		return context.getNum1()-context.getNum2();
	}

}
