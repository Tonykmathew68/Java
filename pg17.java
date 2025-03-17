import java.util.*;
class Shapes1
{
	void area(float l,float b)
	{
		System.out.println("Area of rectangle="+l*b);
	}
}	
class Shapes2 extends Shapes1
{
	void area(float r,float pi)
	{
		
		System.out.println("Area of circle="+pi*r*r);
	}
}
class Shapes3 extends Shapes1
{
	void area(float a,float b)
	{
	
		System.out.println("Area of square="+a*b);
	}
}

class main
{
public static void main(String args[])
{
	Shapes1 obj1=new Shapes1();
	Shapes2 obj2=new Shapes2();
	Shapes3 obj3=new Shapes3();
	obj1.area(2,2);
	obj2.area(2,(float)3.1);
	obj3.area(3,4);
}
}

/*
Output:-
Area of rectangle=4.0
Area of circle=12.4
Area of square=12.0
*/


