/*
Aim:Define a class to record the bank details of a customer (name, account_no, balance) and define methods getData(), displayData() appropriately. Also define constructors to initialize the object.
Demonstrate the methods of Bank class by defining an object in main().
*/

import java.util.Scanner;

class Customer
{
	String name;
	int acNo;
	double balance;
	
	Customer()
	{ }
	
	Customer(String n,int a,double b)
	{
		name=n;
		acNo=a;
		balance=b;
	}
	
	Customer(String n,int a)
	{
		name=n;
		acNo=a;
	}
	
	Customer(String n,double b)
	{
		name=n;
		balance=b;
	}
	
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		System.out.println("Enter Account No : ");
		acNo=sc.nextInt();
		System.out.println("Enter Balance : ");
		balance=sc.nextDouble();
	}
	
	void displayData()
	{
		System.out.println("Name : "+name);
		System.out.println("Account No : "+acNo);
		System.out.println("Balance : "+balance);
	}
}

class CustomerDemo
{
	public static void main(String a[])
	{
		Customer c1=new Customer();
		Customer c2=new Customer("ABC",1002518,50000);
		Customer c3=new Customer("CDE",1002510);
		Customer c4=new Customer("FGH",10000);
	
		System.out.println("Customer 1 ");
		c1.displayData();
		System.out.println("\nCustomer 2 ");
		c2.displayData();
		System.out.println("\nCustomer 3 ");
		c3.displayData();
		System.out.println("\nCustomer 4 ");
		c4.displayData();
	
		System.out.println("\nCustomer 1 ");
		c1.getData();
		c1.displayData();
	}
}

/*Output:
Customer 1
Name : null
Account No : 0
Balance : 0.0

Customer 2
Name : ABC
Account No : 1002518
Balance : 50000.0

Customer 3
Name : CDE
Account No : 1002510
Balance : 0.0

Customer 4
Name : FGH
Account No : 10000
Balance : 0.0

Customer 1 
Enter Name :
XYZ
Enter Account No :
1002524
Enter Balance :
60000
Name : XYZ
Account No : 1002524
Balance : 60000.0
*/
