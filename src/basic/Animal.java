package basic;
//basic java program. Creating an object and calling methods.
public class Animal 
{
	public void eat()
	{
		System.out.println("Buzo is eating.");
	}
	public void sleep()
	{
		System.out.println("Oreo is sleeping.");
	}
	public static void main(String[] args) {
		Animal buzo = new Animal();
		Animal oreo = new Animal();
		buzo.eat();
		oreo.sleep();
	}
}