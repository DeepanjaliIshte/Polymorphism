// Same name

package Overriding;

public class Test_1 {
	void show() {
		System.out.println("1");
	}
}
class XYZ  extends Test_1
{
	void show()
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_1 t1=new Test_1();
		t1.show();
		
		XYZ xyz =new XYZ();
		xyz.show();
	}
	

}
