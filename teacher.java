import java.util.*;
class Employee
{
	int Empid;
	String Name;
	int Salary;
	String Address;
	

	Employee(int id,String n,int s,String a)
	{
		Empid=id;
		Name=n;
		Salary=s;
		Address=a;		
	}
}
	class Teacher extends Employee
	{
		String Dept,Subjtaught;
		
		
		Teacher(int Empid,String Name,int Salary,String Address,String d,String sub)
		{
			super(Empid,Name,Salary,Address);
			Dept=d;
			Subjtaught=sub;
		}
		
		void display()
		{
			System.out.println("******** DETAILS OF TEACHERS*********");
			System.out.println("Employee id:"+Empid);
			System.out.println("Employee name:"+Name);
			System.out.println("Salary:"+Salary);
			System.out.println("Address:"+Address);
			System.out.println("Department:"+Dept);
			System.out.println("Subjects taught:"+Subjtaught);	
		}

	}
	
class main	
{
public static void main(String args[])
{	
	int Empid;
	String Name;
	int Salary;
	String Address;
	String dept;
	String Subjtaught;
	
	Scanner in=new Scanner(System.in);
	Teacher arr[]=new Teacher[5];
	System.out.println("Enter limit:");
	int x=in.nextInt();
	for(int i=0;i<x;i++)
	{
		System.out.println("Enter employee id:");
		Empid=in.nextInt();
		System.out.println("Enter employee name:");
		Name=in.next();
		System.out.println("Enter the salary of the employee:");
		Salary=in.nextInt();
		System.out.println("Enter the address of the employee:");
		Address=in.next();
		System.out.println("Enter the department:");
		dept=in.next();
		System.out.println("Enter the Subjects taught:");
		Subjtaught=in.next();
		
		arr[i]=new Teacher(Empid,Name,Salary,Address,dept,Subjtaught);
	}
	for(int i=0;i<x;i++)
	{
		arr[i].display();
	}
}
}


/*
Output:-
Enter limit:
2
Enter employee id:
1
Enter employee name:
qwe
Enter the salary of the employee:
456
Enter the address of the employee:
qwdsd
Enter the department:
rty
Enter the Subjects taught:
ddss
Enter employee id:
2
Enter employee name:
uyt
Enter the salary of the employee:
4576
Enter the address of the employee:
hjffgh
Enter the department:
ftr
Enter the Subjects taught:
hyfrgh
******** DETAILS OF TEACHERS*********
Employee id:1
Employee name:qwe
Salary:456
Address:qwdsd
Department:rty
Subjects taught:ddss
******** DETAILS OF TEACHERS*********
Employee id:2
Employee name:uyt
Salary:4576
Address:hjffgh
Department:ftr
Subjects taught:hyfrgh
*/
