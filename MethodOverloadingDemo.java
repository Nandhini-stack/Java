/*
Aim:Write a program to add two numbers using method overloading. Demonstrate the methods of Bank class by defining an object in main().
*/

class MethodOverloading
{
	int sum(int a,int b)
	{
		return (a+b);
	}
	
	float sum(float a,int b)
	{
		return (a+b);
	}
	
	float sum(float a,float b)
	{
		return (a+b);
	}
	
	double sum(float a,double b)
	{
		return (a+b);
	}
}

class MethodOverloadingDemo
{
	public static void main(String a[])
	{
		MethodOverloading m=new MethodOverloading();
		
		System.out.println("Sum = "+m.sum(12,6));
		System.out.println("Sum = "+m.sum(12.5f,6));
		System.out.println("Sum = "+m.sum(12.5f,6.8f));
		System.out.println("Sum = "+m.sum(12.5f,5.85));

	}
}

/*Output
Sum = 18
Sum = 18.5
Sum = 19.3
Sum = 18.35
*/
