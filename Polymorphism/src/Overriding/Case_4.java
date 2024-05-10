package Overriding;

public class Case_4 {
	void show()	throws RuntimeException
	{
		System.out.println("1");
	}
}
class Test  extends Case_4{
	void show() throws ArithmeticException
	{
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Case_4 cs=new Case_4();
		cs.show();
		
		Test t=new Test();
		t.show();
	}

}



		
		