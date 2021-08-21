/*
Aim:Write a program to capitalize the first character of each word from a given sentence.
(Example: all the best => All The Best).
*/

import java.util.Scanner;

class Capitalize
{
	public static void main (String args[])
	{
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String : ");
		s1 = sc.nextLine();
		
		String temp;
		temp = s1.substring(0,1);
		temp = temp.toUpperCase();
		s1 = temp + s1.substring(1);
		
		for(int i=0 ; i<s1.length() ; i++)
		{
			if(s1.charAt(i) == ' ')
			{
				temp = s1.substring(i+1 , i+2);
				temp = temp.toUpperCase();
				s1 = s1.substring(0,i+1) + temp + s1.substring(i+2);
			}
		}
		System.out.println("String After Capitalizing : " +s1);
	}
}

/*Output:
Enter The String :
all the best
String After Capitalizing : All The Best*/
