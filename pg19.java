import java.util.*;
interface Shapes
{
	double area();
	double perimeter();
}
class  Circle implements Shapes
{
	double radius;
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public double area()
	{
		return Math.PI*radius*radius;
	}
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
}
class  Rectangle implements Shapes
{
	double length;
	double width;
	public Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public double area()
	{
		return length*width;
	}
	public double perimeter()
	{
		return 2*(length + width);
	}
}

class Interface
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		
		
		while(true)
		{
			System.out.println("Menu:");
			System.out.println("1.Circle");
			System.out.println("2.Rectangle");
			System.out.println("3.Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
		
			if(choice==1)
			{
				System.out.println("Enter redius of the circle:");
				double radius=sc.nextDouble();
				Shapes shape=new Circle(radius);
				System.out.println("Area:"+shape.area());
				System.out.println("Perimeter:"+shape.perimeter());
			}
			else if(choice==2)
			{
				System.out.println("Enter length of the rectangle:");
				double length=sc.nextDouble();
				System.out.println("Enter width of the rectangle:");
				double width=sc.nextDouble();
				Shapes shape=new Rectangle(length,width);
				System.out.println("Area:"+shape.area());
				System.out.println("Perimeter:"+shape.perimeter());
			}
			else if(choice==3)
			{
				System.out.println("Exit");
				break;
			}
			else
			{
				System.out.println("Invalid choice:please try again");
			}
		}		
	}
}


/*
Output:-
Menu:
1.Circle
2.Rectangle
3.Exit
Enter your choice:
1
Enter redius of the circle:
2
Area:12.566370614359172
Perimeter:12.566370614359172
Menu:
1.Circle
2.Rectangle
3.Exit
Enter your choice:
2
Enter length of the rectangle:
4
Enter width of the rectangle:
5
Area:20.0
Perimeter:18.0
Menu:
1.Circle
2.Rectangle
3.Exit
Enter your choice:
3
Exit
*/
