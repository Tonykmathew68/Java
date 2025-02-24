import java.util.*;
class Matrix
{
	int i,j,r1,c1,r2,c2;
	int[][] m1=new int[5][5];
	int[][] m2=new int[5][5];
	int[][] m3=new int[5][5];

	void read()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of row in first matrix");
		r1=in.nextInt();
		System.out.println("Enter the size of column in first matrix");
		c1=in.nextInt();
		System.out.println("Enter the size of row in second matrix");
		r2=in.nextInt();
		System.out.println("Enter the size of column in second matrix");
		c2=in.nextInt();

		
		System.out.println("The first matrix:");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				m1[i][j]=in.nextInt();
			}
		}
		
		
		System.out.println("The second matrix:");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				m2[i][j]=in.nextInt();
			}
		}
	}

	void add()
	{
		System.out.println("The sum matrix:");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				m3[i][j]=m1[i][j]+m2[i][j];
				System.out.println(m3[i][j]+"\t");
			}
		System.out.println("\n");
		}
	}
public static void main(String args[])
{
	Matrix mat=new Matrix();
	mat.read();
	mat.add();
}
}

/*Output:
Enter the size of row in first matrix
2
Enter the size of column in first matrix
2
Enter the size of row in second matrix
2
Enter the size of column in second matrix
2
The first matrix:
1
2
3
4
The second matrix:
5
6
7
8
The sum matrix:
6	8	
10	12	
*/
