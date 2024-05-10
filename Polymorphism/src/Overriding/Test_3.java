package Overriding;

public class Test_3 {

	void show(int a,String b) 
	{
		System.out.println("1");
	}
}
class XYZ3  extends Test_3
{
	void show(String b)
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_3 t3=new Test_3();
		t3.show(17,"DS");
		
		XYZ3 xyz3=new XYZ3();
		xyz3.show("DS");
	}

}









