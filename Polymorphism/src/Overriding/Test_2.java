// Sequence of argument

package Overriding;

public class Test_2 {

	void show(int a,String b) 
	{
		System.out.println("1");
	}
}
class XYZ2  extends Test_2
{
	void show(String b,int a)
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_2 t2=new Test_2();
		t2.show(17,"DS");
		
		XYZ2 xyz2=new XYZ2();
		xyz2.show("DS",17);
	}
	

}
