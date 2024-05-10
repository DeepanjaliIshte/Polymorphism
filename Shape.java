import java.util.*;
abstract class Shape
{
abstract public void area();
abstract public void vol();
}
class Cone extends Shape
{
int r,s,h;
Cone(int r,int s,int h)
{
	this.r=r;
this.s=s;
this.h=h;
}
public void area()
{
System.out.println("Area of Cone = "+(3.14*r*s));
}
public void vol()
{
System.out.println("volume of Cone = "+(3.14*r*r*h)/3);
}
}
class Cylinder extends Shape
{ int r,h;
Cylinder(int r,int h)
{ this.r=r;
this.h=h;
}
public void area()
{ System.out.println("Area of Cylinder = "+(2*3.14*r*h));
}
public void vol()
{
System.out.println("volume of Cylinder = "+(3.14*r*r*h));
}
}
