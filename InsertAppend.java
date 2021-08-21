/*
Aim:Write a program to insert a substring in the middle of the given string and also append some substring at the end of the given string.
(Example: Object language => Object oriented language improves security).
*/

import java.util.Scanner;

class InsertAppend
{
	public static void main (String args[])
	{
		StringBuffer s1 = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String : ");
		s1.append(sc.nextLine());
		
		String sub;
		System.out.println("Enter The SubString To Be Inserted: ");
		sub = sc.nextLine();
		
		int pos;
		System.out.println("Enter The Position : ");
		pos = sc.nextInt();
		sc.nextLine();
		
		s1.insert(pos-1,sub);
		System.out.println("String After Insertion : " + s1);
		
		System.out.println("Enter The String To Be Appended : ");
		sub = sc.nextLine();
		
		s1.append(sub);
		System.out.println("String After Appending: " + s1);

	}	
}

/*
Output : 
Enter The String :
Object Lang
Enter The SubString To Be Inserted :
Oriented
Enter The Position :
8
String After Insertion : Object Oriented Lang
Enter The String To Be Appended :
uage Improves Security
String After Appending: Object Oriented Language Improves Security
*/
