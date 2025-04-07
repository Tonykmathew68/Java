class Except
{
	public static void main(String args[])
	{
	//ArithmeticException
	   try
	   {
		int a=10;
		int b=5;
		int r;
		r=a/b;
		System.out.println("Result="+r);
	   }
	   catch(ArithmeticException e)
	   {
		System.out.println("error:ArithmeticException");
	   }
	//ArrayIndexOutOfBoundsException
	   try
	   {
		int[] numbers={1,2,3,4,15};
		System.out.println("Acessing index 4:"+numbers[4]);
	   }
	   catch(ArrayIndexOutOfBoundsException e)
	   {
		System.out.println("error:ArrayIndexOutOfBoundsException");
	   }
	}
}

/*
Output:-
Result=2
Acessing index 4:15

r=10/0;
Acessing index 4:"+numbers[5]
error:ArithmeticException
error:ArrayIndexOutOfBoundsException
*/

