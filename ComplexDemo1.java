/*
Aim:Define a class to represent a complex number(real,imaginary) and define a method ‘addComplex(Complex, Complex)’ that adds two complex numbers. Define the ‘Complex’ class in a package named ‘Numbers’ and create objects of Complex class by importing this package into the main() class program.
*/


package Numbers;
public class Complex
{
	int real, img;
	
	public Complex()
	{}
	
	public Complex(int r, int i)
	{
		real=r;
		img=i;
	}
	
	public void display()
	{
		System.out.println(real + "+" + img + "i");
	}
	
	public Complex addComplex(Complex a , Complex b )
	{
		Complex c = new Complex();
		c.real = a.real + b.real;
		c.img = a.img + b.img;
		return c;
	}
}

import Numbers.Complex;
class ComplexDemo1
{
	public static void main(String args[])
	{

	Complex c1 = new Complex(5,6);
	Complex c2 = new Complex(13,4);
	Complex c3 = new Complex();
	
	System.out.println("Complex Number 1 :");
	c1.display();
	System.out.println("Complex Number 2 :");
	c2.display();
	
	c3 = c3.addComplex(c1 , c2);

	System.out.println("Sum Of Complex Numbers :");
	c3.display();
	}
}

/*Output
Complex Number 1 :
5+6i
Complex Number 2 :
13+4i
Sum Of Complex Numbers :
18+10i
*/
