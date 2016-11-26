package state;

public class Context {

	private State state;
	
	public Context(State state){
		this.state = state;
	}
	
	
	
	public State getState() {
		return state;
	}



	public void setState(State state) {
		this.state = state;
	}



	public void look(){
		if(state.getState().equals("state1")){
			state.method1();
		}
		
		if(state.getState().equals("state2")){
			state.method2();
		}
	}
}
