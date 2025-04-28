class FibonacciGenerator implements Runnable
{
	private int count;
	public FibonacciGenerator(int count)
	{
		this.count=count;
	}
	public void run()
	{
		int a=0,b=1;
		System.out.println("Fibonacci Series:");
		for(int i=0;i<count;i++)
		{
			System.out.println(a + " ");
			int temp=a+b;
			a=b;
			b=temp;
		}
		System.out.println();
	}
}

class EvenNumberDisplay implements Runnable
{
	int start,end;
	EvenNumberDisplay(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public void run()
	{
		System.out.println("Even numbers:");
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.println(i + " ");
			}
		}
		System.out.println();
	}
}
public class runnable
{
	public static void main(String args[])
	{
		Thread fib=new Thread(new FibonacciGenerator(10));
		Thread even=new Thread(new EvenNumberDisplay(1,20));
		fib.start();
		even.start();
	}
}



/*
Output:

Fibonacci Series:
Even numbers:
0 
2 
1 
1 
2 
3 
5 
8 
4 
13 
6 
8 
10 
12 
14 
21 
34 
16 

18 
20 

*/
