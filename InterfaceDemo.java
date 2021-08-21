/*
Aim:Define interface for Area and Volume, and implement the required interfaces in Circle class and Sphere class.
*/

interface Area
{
	double pi = 3.142;
	void compute();
}

interface Volume
{
	void compute();
}

class Circle implements Area
{
	double r;
	 	Circle(double rad)
		{
			r = rad;
		}
	public void compute()
	{
		System.out.println("Area of the circle : " +(pi*r*r));
	}
}

class Sphere implements Area , Volume
{	
	double r;
	 	Sphere(double rad)
		{
			r = rad;
		}
	public void compute()
	{
		System.out.println("Area of the Sphere : " +(4*pi*r*r));
		System.out.println("Volume of the Sphere : " +(4.0/3*pi*r*r*r));
	}
}

class InterfaceDemo
{
	public static void main (String args[])
	{
		Circle c = new Circle(5);
		c.compute();
		
		Sphere s = new Sphere (5);
		s.compute();

	}
}

/*
Output:
Area of the circle : 78.55
Area of the Sphere : 314.2
Volume of the Sphere : 523.6666666666666
*/
