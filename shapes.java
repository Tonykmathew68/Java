import java.util.*;
class Shapes
{
	void rect(int l,int b)
	{
		System.out.println("Area of rectangle="+l*b);
	}
	
	void circle(float r)
	{
		System.out.println("Area of circle="+3.14*r*r);
	}
	
	void sqr(int a)
	{
		System.out.println("Area of square="+a*a);
	}
public static void main(String args[])
{
	Shapes obj=new Shapes();
	obj.rect(2,4);
	obj.circle((float)2.3);
	obj.sqr(3);
}
}

/*
Output:-
Area of rectangle=8
Area of circle=16.610599311256415
Area of square=9
*/
