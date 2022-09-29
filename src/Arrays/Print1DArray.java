package Arrays;
//four ways to print the array by using for,for-each,while and do-while loop.
public class Print1DArray
{
	public static void main(String[] args)
	{
		int[] a= {10,20,30,50,20,70};
		System.out.print("By for loop:      ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		//----------------------------------------
		System.out.print("By for-each loop: ");
		for(int i:a)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		//----------------------------------------
		System.out.print("By while loop:    ");
		int i=0;
		while(i<a.length)
		{
			System.out.print(a[i] + " ");
			i++;
		}
		System.out.println();
		//----------------------------------------
		System.out.print("By do-while loop: ");
		int i1=0;
		do
		{
			System.out.print(a[i1] + " ");
			i1++;
		}while(i1<a.length);
	}
}
