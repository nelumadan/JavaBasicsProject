package StringBuff;

public class StringBuff
{
	public static void main(String[] args)
	{
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
		
		StringBuffer sb2=new StringBuffer("neelam madan");
		System.out.println(sb2.capacity());
		
		StringBuffer sb3=new StringBuffer(1000);
		System.out.println(sb3.capacity());
	}
}
