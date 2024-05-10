
public class Aa {
void f1()              // Method Overriding
{
	System.out.println("f1() of Aa");
}
}
class Bb extends Aa{
	void f1()
	{
		System.out.println("f1() of Bb");
	}
}
