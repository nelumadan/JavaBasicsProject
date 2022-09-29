package StringBuff;

public class StrBuff_method
{
	public static void main(String[] args)
	{
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity()); //original capacity=16 because stringbuffer can hold 16 characters
	
		sb1.append("hello");
		System.out.println(sb1);
		System.out.println(sb1.capacity()); //still original capacity=16 because characters are still within range after append
		
		sb1.append(" neelam madan");
		System.out.println(sb1);
		System.out.println(sb1.capacity()); //original (capacity+1)*2=34 because more than 16 characters got appended
	}
}
