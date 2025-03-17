import java.util.*;
class Person
{
	String name;
	String gender;
	String address;
	int age;

	Person(String n,String g,String ad,int ag)
	{
		name=n;
		gender=g;
		address=ad;
		age=ag;		
	}
}
class Employee extends Person
{
	int empid,salary;
	String cname,qualification;
	
	Employee(String name,String gender,String address,int age,int empid,String cname,String qualification,int salary)
	{
		super(name,gender,address,age);
		this.empid=empid;
		this.cname=cname;
		this.qualification=qualification;
		this.salary=salary;
	}
}
class Teacher extends Employee
{
	int teachid;
	String sub,dept;
	
Teacher(String name,String gender,String address,int age,int empid,String cname,String qualification,int salary,int teachid,String sub,String dept)
	{
		super(name,gender,address,age,empid,cname,qualification,salary);
		this.teachid=teachid;
		this.sub=sub;
		this.dept=dept;
	}
	
	void display()
	{
		System.out.println("******** DETAILS OF TEACHERS*********");
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Address:"+address);
		System.out.println("Age:"+age);
		System.out.println("Employee id:"+empid);
		System.out.println("Company name:"+cname);
		System.out.println("Qualification:"+qualification);
		System.out.println("Salary:"+salary);
		System.out.println("Teacher id:"+teachid);
		System.out.println("Subject:"+sub);			
		System.out.println("Department:"+dept);
	}		
}

class main	
{
public static void main(String args[])
{	
	String name;
	String gender;
	String address;
	int age;
	int empid;
	int salary;
	String cname;
	String qualification;
	int teachid;
	String sub;
	String dept;

	Scanner in=new Scanner(System.in);
	Teacher arr[]=new Teacher[5];
	System.out.println("Enter limit:");
	int x=in.nextInt();
	for(int i=0;i<x;i++)
	{
		System.out.println("Enter employee name:");
		name=in.next();
		System.out.println("Enter gender:");
		gender=in.next();
		System.out.println("Enter the address of the employee:");
		address=in.next();
		System.out.println("Enter the age of the employee:");
		age=in.nextInt();
		System.out.println("Enter the employee id:");
		empid=in.nextInt();
		System.out.println("Enter the salary of the employee:");
		salary=in.nextInt();
		System.out.println("Enter the company name of the employee:");
		cname=in.next();
		System.out.println("Enter the qualification of the employee:");
		qualification=in.next();
		System.out.println("Enter the teacher id:");
		teachid=in.nextInt();
		System.out.println("Enter the Subjects:");
		sub=in.next();
		System.out.println("Enter the department:");
		dept=in.next();

		arr[i]=new Teacher(name,gender,address,age,empid,cname,qualification,salary,teachid,sub,dept);
	}
	for(int i=0;i<x;i++)
	{
		arr[i].display();
	}
}
}


/*
OUtput:-
Enter limit:
2
Enter employee name:
qwer
Enter gender:
m
Enter the address of the employee:
lkjhgfg
Enter the age of the employee:
34
Enter the employee id:
1
Enter the salary of the employee:
6576789
Enter the company name of the employee:
cderfv
Enter the qualification of the employee:
bca
Enter the teacher id:
2
Enter the Subjects:
math
Enter the department:
cs
Enter employee name:
poi
Enter gender:
f
Enter the address of the employee:
bgtr
Enter the age of the employee:
36
Enter the employee id:
3
Enter the salary of the employee:
56789
Enter the company name of the employee:
cdew
Enter the qualification of the employee:
mca
Enter the teacher id:
4
Enter the Subjects:
science
Enter the department:
mech
******** DETAILS OF TEACHERS*********
Name:qwer
Gender:m
Address:lkjhgfg
Age:34
Employee id:1
Company name:cderfv
Qualification:bca
Salary:6576789
Teacher id:2
Subject:math
Department:cs
******** DETAILS OF TEACHERS*********
Name:poi
Gender:f
Address:bgtr
Age:36
Employee id:3
Company name:cdew
Qualification:mca
Salary:56789
Teacher id:4
Subject:science
Department:mech
*/
