package encapsulation;

public class TestEncapsulation
{
	public static void main(String[] args)
	{
		Account johnAccount=new Account();
		johnAccount.setAccno(111);
		johnAccount.setName("John");
		System.out.println("The a/c no. is: " +johnAccount.getAccno());
		System.out.println("The Name. is: " +johnAccount.getName());
	}
}
