//same method name that's why compiler confuse and no gives you output.

		// Same Name
package Overloading;

public class Test_1 {
	void show()
	{
		System.out.println("1");
	}
	
	void show()
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_1 t1=new Test_1();
		t1.show();
	}

}



