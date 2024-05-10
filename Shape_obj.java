import java.util.Scanner;

public class Shape_obj {
	public static void main(String args[])
	{ Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius, side and height for cone");
	int r =sc.nextInt();
	int s1 =sc.nextInt();
	int h =sc.nextInt();
	Shape s;
	s=new Cone(r,s1,h);
	s.area();
	s.vol();
	System.out.println("Enter radius, height for cylinder");
	r =sc.nextInt();
	h =sc.nextInt();
	s=new Cylinder(r,h);
	s.area();
	s.vol();
	}
}
