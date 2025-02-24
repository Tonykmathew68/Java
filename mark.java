import java.util.*;
class Student
{
	int Rollno;
	String Name;
	int[] mark=new int[4];
	void read()
	{
		int i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the roll.no=");
		Rollno=in.nextInt();
		System.out.println("Enter the name=");
		Name=in.next();
		System.out.println("Enter the marks=");
		for(i=0;i<4;i++)
		{
			mark[i]=in.nextInt();
		}
	}
	void check()
	{
		int sum=0;
		for(int i=0;i<4;i++)
		{
			sum=sum+mark[i];
		}
		System.out.println("The total marks="+sum);
		int per=(sum*100)/400;
		System.out.println("Percentage="+per);
	}
public static void main(String args[])
{
	Student obj1=new Student();
	obj1.read();
	obj1.check();
}
}

/*Output:
Enter the roll.no=
1
Enter the name=
abin
Enter the marks=
80
90
89
90
The total marks=349
Percentage=87
*/
