package basic;
//Initializing Object by using reference variable.
public class Animal1 
{
	String color;
	int age;
	public static void main(String[] args) 
	{
		Animal1 buzo = new Animal1();
		Animal1 oreo = new Animal1();
		buzo.color="black";
		buzo.age=10;
		oreo.color="white";
		oreo.age=12;
		System.out.println("Buzo is"+" "+buzo.color+" "+"in color and "+buzo.age+" "+"years old.");
		System.out.println("Oreo is"+" "+oreo.color+" "+"in color and "+oreo.age+" "+"years old.");
	}
}