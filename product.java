import java.util.*;
class Product
{
	int pprice,pcode;
	String pname;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		pname=sc.nextLine();
		pcode=sc.nextInt();
		pprice=sc.nextInt();
	}
	void compare(Product p1,Product p2,Product p3)
	{
		if(p1.pprice>p2.pprice && p1.pprice>p3.pprice)
		{
			if(p2.pprice<p3.pprice)
			{
				System.out.println("Smallest price is"+p2.pprice+"product is"+p2.pname);
			}
			else
			{
				System.out.println("Smallest price is"+p3.pprice+"product is"+p3.pname);
			}	
		}
		else
		{
			System.out.println("Smallest price is"+p1.pprice+"product is"+p1.pname);
		}
	}
	public static void main(String args[])
	{
		Product p1=new Product();
		System.out.println("Enter first prod details");
		p1.read();
		Product p2=new Product();
		System.out.println("Enter second prod details");
		p2.read();
		Product p3=new Product();
		System.out.println("Enter third prod details");
		p3.read();
		Product p=new Product();
		p.compare(p1,p2,p3);
	}
}
