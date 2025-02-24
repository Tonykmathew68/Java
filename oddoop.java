import java.util.Scanner;
class Check
{
	void oddeven(int a)
	{
		if(a%2==0)
		{
			System.out.println("Even number");		
		}
		else
		{
			System.out.println("Odd number");
		}	
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		Check n=new Check();
		System.out.println("Enter a number");
		int a=in.nextInt();
		n.oddeven(a);
	}
}
