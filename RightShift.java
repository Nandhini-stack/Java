/*
Aim:Write a program to take input for an integer from the user and perform both bitwise right shift operations. Take input for the no. of positions to be shifted.
*/

import java.util.Scanner;

class RightShift
{
	public static void main(String args[])
	{
		byte n,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for n:");
		n=sc.nextByte();
		System.out.println("Enter the number of positions to shift:");
		s=sc.nextByte();
		System.out.println("Signed Right Shift="+(n>>s));
		System.out.println("Unsigned Right Shift="+(n>>>s));
	}
}


/*Output(For positive number):

Enter the value for n:
12
Enter the number of positions to shift:
2
Signed Right Shift=3
Unsigned Right Shift=3

Output(For negative number):

Enter the value for n:
-12
Enter the number of positions to shift:
2
Signed Right Shift=-3
Unsigned Right Shift=1073741821
*/
