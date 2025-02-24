import java.util.Scanner;
class Check
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=in.nextInt();
		if(a%2==0)
		{
			System.out.println("Even number");		
		}
		else
		{
			System.out.println("Odd number");
		}
	}
}
