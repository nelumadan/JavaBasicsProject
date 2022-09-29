package Arrays;

public class Print2DArray 
{
	public static void main(String[] args)
	{
		int a[][]= {{2,7,9,8,6},{7,9,2,6},{5,6,8,2,4,9}};
		for(int i=0;i<a.length;i++)//for loop
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] + " ");
			}
		System.out.println();
		}
	}
}
