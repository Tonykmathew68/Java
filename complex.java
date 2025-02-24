import java.util.*;
class Complex
{
	int real,img;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		real=sc.nextInt();
		img=sc.nextInt();
	}
	void add(Complex c1,Complex c2)
	{
		real=c1.real+c2.real;
		img=c1.img+c2.img;
		System.out.println("Sum="+real+"+i"+img);
	}
	public static void main(String args[])
	{
		Complex c1=new Complex();
		System.out.println("Enter first number");
		c1.read();
		Complex c2=new Complex();
		System.out.println("Enter second number");
		c2.read();
		Complex c=new Complex();
		c.add(c1,c2);
	}
}

