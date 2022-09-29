package Strings;
//Types of string constructors
public class Str_constructor
{
	public static void main(String[] args)
	{
		String s=new String();//no argument constructor creates an empty object.
		String n=new String("neelam");//string argument constructor creates 2 objects
		StringBuffer sb1=new StringBuffer("StringBuffer");//stringBuffer constructor creates mutable object
		StringBuilder sb2=new StringBuilder("StringBuilder");//stringBuilder constructor creates mutable object
		byte[] b1= {101,102,103};//creating an array of bytes which 
		char[] c1= {'a', 'b', 'c'};//creating an array of characters
		
		String s1=new String(sb1);//passed the reference of sb1 into String constructor which creates immutable object
		String s2=new String(sb2);//passed the reference of sb2 into String constructor which creates immutable object
		String s3=new String(b1);//byte array passed through String constructor which converts the bytes into characters
		String s4=new String(c1);//character array passed through String constructor which converts the values into a string of chars
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
