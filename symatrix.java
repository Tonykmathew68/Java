import java.util.*;
class Symmetric
{
	int i,j,r1,c1,flag=0;
	int[][] m1=new int[5][5];
	int[][] m2=new int[5][5];
	
	void read()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of row in matrix");
		r1=in.nextInt();
		System.out.println("Enter the size of column in matrix");
		c1=in.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				m1[i][j]=in.nextInt();
			}
		}
	}
	
	void trans()
	{
		System.out.println("Transpose matrix:");		
		for(int i=0;i<c1;i++)
		{
			for(int j=0;j<r1;j++)
			{
				m2[j][i]=m1[i][j];
			}
		}
				
		for(int i=0;i<c1;i++)
		{
			for(int j=0;j<r1;j++)
			{
				if(m1[i][j]!=m2[i][j])
				{
					flag=1;
					break;
				}	
			}
		}
		
	}
	
	void check()
	{
		if(flag==1)
		{
			System.out.println(" notsymm");	
		}
		else
		{
			System.out.println("symm");
		}
	}
public static void main(String args[])
{
	Symmetric obj=new Symmetric();
	obj.read();
	obj.trans();
	obj.check();
}
}

/*Output:
Enter the size of row in matrix
2
Enter the size of column in matrix
2
Enter the elements
2
1
2
1
Transpose matrix:
 notsymm


Enter the size of row in matrix
2
Enter the size of column in matrix
2
Enter the elements
1
1
1
1
Transpose matrix:
symm
*/

