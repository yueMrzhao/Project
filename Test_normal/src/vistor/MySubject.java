package vistor;

public class MySubject implements Subject {

	public void accept(Vistor vistor){
		vistor.visit(this);
	}
	
	public void getSubject(){
		System.out.println("haha!");
	}
}
