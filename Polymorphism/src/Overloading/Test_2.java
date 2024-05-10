//now put on the value int,string or any different data type then program gives you output

		// SAme Sequence
package Overloading;

public class Test_2 {
	void show(int a)
	{
		System.out.println("1");
	}
	
	void show(int a,int b)
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_2 t2=new Test_2();
		t2.show(2);
	}
}


