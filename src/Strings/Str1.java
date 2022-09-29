package Strings;
//== operator compares the reference and .equals() method compares the content.
public class Str1
{
	static String s1=new String("neelam");
	static String s2=new String("neelam");
	static String s3="anil";
	static String s4="anil";
	
	public static void main(String[] args)
	{
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println("-------");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
	}
}
