package St_block;
//static blocks gets executed automatically before everything when the class is loaded in the memory 
//but, after version1.6 the class needs to have main method.
//even if there are multiple static blocks they get executed first from top to bottom.
public class Test
{
	static
	{
		System.out.println("static block1");
	}
	public static void main(String[] args)
	{
		System.out.println("main method");
	}
	static
	{
		System.out.println("static block2");
	}
}
