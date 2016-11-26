package vistor;

public class Test {

	public static void main(String[] argus){
		Vistor vistor =new MyVistor();
		Subject subject = new MySubject();
		subject.accept(vistor);
		
	}
}
