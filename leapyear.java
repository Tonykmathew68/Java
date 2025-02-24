import java.util.Scanner;
class Leapyear
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter starting year=");
		int y1=in.nextInt();
		System.out.println("Enter ending year=");
		int y2=in.nextInt();
		for(int i=y1;i<=y2;i++)
		{
			if(i%4==0 && i%100!=0 || i%400==0)
			{
				System.out.println("Leap years=" +i);	
			}
		}		
	}
}
