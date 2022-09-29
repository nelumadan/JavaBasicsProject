package abstraction;

abstract class Vehicle
{
	abstract void start();
	
	public static void main(String[] args)
	{
		Car c = new Car();
		c.start();
		Scooter s = new Scooter();
		s.start();
	}
}

class Car extends Vehicle
{
	void start()
	{
		System.out.println("car starts with a key.");
	}
}

class Scooter extends Vehicle
{
	void start()
	{
		System.out.println("scooter starts with a kick.");
	}
}