/*
Aim:Write a program to accept and display the month number. Throw an exception if improper month number is entered. Make your own exception class to handle this exception.
*/

import java.util.Scanner;
class MonthException extends Exception
{
	String msg;
	MonthException()
	{
		msg="INVALID month number";
	}
}

class MonthExceptionDemo
{
	public static void main (String args[])
	{
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Month : ");
		x = sc.nextInt();
		
		if (x>=1&&x<=12)
		{
			System.out.println("VALID month number");
		}
		else
		{
			try
			{
				throw new MonthException();
			}
			catch (MonthException m)
			{
				System.out.println(m.msg);
			}
		}
	}
}

/*
Output :
Enter A Month :
8
VALID month number

Enter A Month :
24
INVALID month number
*/
