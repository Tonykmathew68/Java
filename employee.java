import java.util.*;
class Employee
{
	int eNo,Salary;
	String eName;
	Scanner in=new Scanner(System.in);	
	void read()
	{
		System.out.println("Enter employee number:");
		eNo=in.nextInt();
		System.out.println("Enter employee name:");
		eName=in.next();
		System.out.println("Enter the salary of the employee:");
		Salary=in.nextInt();
	}

	void search()
	{
		System.out.println("Enter the seached employee number:");
		int n=in.nextInt();
		
			if(eNo==n)
			{
				System.out.println("Employee found");
				System.out.println("Employee name:"+eName);
				System.out.println("Salary:"+Salary);
			}
			else
			{
				System.out.println("Employee not found");
			}
		
	}
public static void main(String args[])
{	
	Employee obj[]=new Employee[5];
	for(int i=0;i<5;i++)
	{
		obj[i]=new Employee();
		obj[i].read();
	}
	for(int i=0;i<5;i++)
	{
		obj[i].search();
	}
}
}

/*Output:
Enter employee number:
1
Enter employee name:
qwe
Enter the salary of the employee:
456
Enter employee number:
2
Enter employee name:
frt
Enter the salary of the employee:
5678
Enter employee number:
3
Enter employee name:
hyrs
Enter the salary of the employee:
6543
Enter employee number:
4
Enter employee name:
poiuy
Enter the salary of the employee:
5678906
Enter employee number:
5
Enter employee name:
fresx
Enter the salary of the employee:
678906644
Enter the seached employee number:
1
Employee found
Employee name:qwe
Salary:456
Enter the seached employee number:
9
Employee not found*/
