package Strings;
//string methods in Java
public class Str_method 
{
	public static void main(String[] args)
	{
		String name1="   neelam   ";
		String name2="anil";
		String name3="ANIL";
		String name4="madan";
		String d = "This is a Demo";
		System.out.println("name1= " + name1.trim());//trims the leading and trailing spaces in the string.
		System.out.println("name2= " + name2);
		System.out.println("name3= " + name3);
		System.out.println("length= "+name1.trim().length());//trims and then returns the length of the string.
		System.out.println("isEmpty= "+name1.isEmpty());//returns true if length is 0, else returns false.
		System.out.println("isEqual= "+name1.equals(name2));//returns true if 2 strings are equal else returns false.
		System.out.println("isEqualIgnoreCase= "+name2.equalsIgnoreCase(name3));//returns true if 2 strings are equal(ignoring case) else returns false.
		System.out.println("compareTo= "+ name2.compareTo(name3));//returns +ve int if 1st string > 2nd String
		System.out.println("compareTo= "+ name3.compareTo(name2));//returns -ve int if 1st string < 2nd String
		System.out.println("compareToIgnoreCase= "+name2.compareToIgnoreCase(name3));//returns 0 if 1st string = 2nd String(ignoring case)
		System.out.println("full name= " + name1.trim() + " " +name4);//concats 2 strings using + operator
		System.out.println(name3 + 10);//will print name10
		System.out.println(name3 + 10 + 20);//will print name1020
		System.out.println(10 + name3 + 20);//will print 10name20
		System.out.println(10 + 20 + name3);//will add ints first and print 30name
		System.out.println(name3 + 20/10);//will do math first and print name2
		System.out.println(name3 + 20*10);//will do math first and print name200
		System.out.println("full name= " + name2.concat(name4));//concats 2 strings
		System.out.println(String.join(" & ", name2, name1.trim()) + " " + name4);//joins 2 strings with a delimiter
		System.out.println("subsequence= " + (d.subSequence(10, 14)));
		System.out.println("substring= " + (d.substring(10)));
		System.out.println("substring= " + (d.substring(10, 14)));
		System.out.println("replace= " + d.replace("is", "was"));
		System.out.println("replaceFirst= " + d.replaceFirst("is", "was"));
		System.out.println("replaceAll= " + d.replaceAll("is", "was"));
		System.out.println("replaceAll= " + d.replaceAll("is(.)", "was"));
		System.out.println("replaceAll= " + d.replaceAll("is(.*)", "was"));
		System.out.println(name2 + " index of n= " + name2.indexOf("n"));//will give index of first 'n' found.
		System.out.println(name2 + " index of nil= " + name2.indexOf("nil"));//will give index of string 'nil'.
		System.out.println(name2 + " last index of n= " + name2.lastIndexOf("n"));//will give index of first 'n' found starting from end.
		System.out.println(name2 + " char at position 1= " + name2.charAt(1));
		System.out.println(name1.trim() + " contains ee= " + name1.contains("ee"));
		System.out.println(name2 + " starts with a= " + name2.startsWith("a"));
		System.out.println(name2 + " ends with l= " + name2.endsWith("l"));
		System.out.println(name2 + " to uppercase= " + name2.toUpperCase());
		System.out.println(name3 + " to lowercase= " + name3.toLowerCase());
		System.out.println("-------------------------------");
		//-----------------------------------
		int a = 10;
		int b = 20;
		System.out.println(a+b);//adds integers a and b
		String s1=String.valueOf(a);//converts int a into string s1
		String s2=String.valueOf(b);//converts int b into string s2
		System.out.println(s1+s2);//concatenates strings s1 and s2
		System.out.println("-------------------------------");
		//-----------------------------------
		char[] c=name3.toCharArray();//converts string name3 into array of char's c
		System.out.println(c);
	}
}
