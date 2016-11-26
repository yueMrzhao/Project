package adapter;


public class Test {
	
	public static void main(String[] args){
		TargetTable targerTable = new Adapter();
		TargetTable targerTable2 = new Wapper();
		TargetTable targerTable3 = new SourceSub1();
		TargetTable targerTable4 = new SourceSub2();
//		targerTable.method1();
//		targerTable.method2();
//		targerTable2.method1();
//		targerTable2.method2();
		targerTable3.method1();
		targerTable3.method2();
		targerTable4.method1();
		targerTable4.method2();
	}
}
