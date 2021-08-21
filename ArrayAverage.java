/*
Aim:Write a program to take input for ‘N’ integers in an array and display only those integers that are greater than the average of all integers.
*/

import java.util.Scanner;

class ArrayAverage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter The Size Of Array");
		n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter The Elements Of Array");
		for(int i=0 ; i<n ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		double avg=0;
		for(int i=0 ; i<n ; i++)
		{
			avg = avg + a[i];
		}
		avg = avg/n;
		
		System.out.println("Average is : " + avg);
		
		System.out.println("The Elements Greater Than Average :");
		for(int i=0 ; i<n ; i++)
		{
			if(a[i]>avg)
				{
				System.out.println(a[i]);
				}
		}
	}
}

/*Output:
Enter The Size Of Array
5
Enter The Elements Of Array
1
2
3
4
5
Average is : 3.0
The Elements Greater Than Average :
4
5
*/
