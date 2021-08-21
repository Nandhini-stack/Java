/*
Aim:Define a class Vehicle with a method display() which shows the current state of the vehicle.Define classes Bike and Car which overrides the display() method of Vehicle class. Demonstrate dynamic method dispatch in main().
*/

class Vehicle
{
	void display()
	{
		System.out.println("Vehicle is parked");
	}
}

class Bike extends Vehicle
{
	void display()
	{
		System.out.println("Bike is running at 18 kmph");
	}
}

class Car extends Vehicle
{
	void display()
	{
		System.out.println("Car is parked safely");
	}
}

class VehicleDemo
{
	public static void main (String args[])
	{
		Vehicle v1 = new Bike();
		v1.display();
		
		Vehicle v2 = new Car();
		v2.display();
	}
}

/*
Output :
Bike is running at 18 kmph
Car is parked safely
*/
