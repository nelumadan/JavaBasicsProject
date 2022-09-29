package basic;
//Initializing Object by using method.
public class Animal2 
{
	String color;
	int age;
	void initObj(String c, int a)
	{
		color=c;
		age=a;
	}
	void display()
	{
		System.out.println("Buzo is"+" "+color+" "+"in color and"+" "+age+" "+"years old.");
	}
	public static void main(String[] args) {
		Animal2 buzo = new Animal2();
		buzo.initObj("Black", 10);
		buzo.display();
	}
}
