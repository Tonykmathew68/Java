import java.util.*;
class Search
{
	int i,flag=0;
	int[] arr=new int[4];
	Scanner in=new Scanner(System.in);
	void read()
	{	
		
		System.out.println("Enter the elements:");
		for(i=0;i<4;i++)
		{
			arr[i]=in.nextInt();
		}
	}
	void search()
	{
		System.out.println("Enter the search elements:");
		int n=in.nextInt();
		for(i=0;i<4;i++)
		{
			if(arr[i]==n)
			{
				flag=1;
				break;	
			}
		}
	}
	void display()
	{
		if(flag==1)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("notfound");
		}
	}
public static void main(String args[])
{
	Search obj1=new Search();
	obj1.read();
	obj1.search();
	obj1.display();
}
}

/*Output:
Enter the elements:
1
3
55
6
Enter the search elements:
55
found*/

