/*
Aim:Write a program to print 1A2B3C4D5E6F7G8H9I10J using two child threads.
*/

class Digit extends Thread
{
	public void run()
	{
		for (int i=1 ; i<=10 ; i++)
		{
			System.out.print(i);
			
			try
			{
				Thread.sleep(400);
			}
			catch (InterruptedException e)
			{}
		}
	}
}

class Alpha extends Thread
{
	public void run()
	{
		for (int i=1 ; i<=10 ; i++)
		{
			System.out.print((char)(64+i));
			
			try
			{
				Thread.sleep(450);
			}
			catch (InterruptedException e)
			{}
		}
	}
}

class MultiThread
{
	public static void main (String args[])
	{
		Digit d = new Digit();
		Alpha a = new Alpha();
		
		d.start();
		a.start();
	}
}

/*
Output : 

1A2B3C4D5E6F7G8H9I10J
*/
