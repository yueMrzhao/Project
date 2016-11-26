package state;

public class Test {

	public static void main(String[] argus){
		State state = new State("state1");
		Context context = new Context(state);
		context.look();
		state.setState("state2");
		context.look();
	}
}
