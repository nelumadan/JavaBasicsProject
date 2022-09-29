package Arrays;

public class Print3DArray
{
	public static void main(String[] args)
	{
		int a[][][]= {{{20,70,90,80,60,40,70},{70,90,20,60,30,20},{50,60,80,20,70,40,90}}};
		for(int i=0;i<a.length;i++)//for loop
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
				System.out.print(a[i][j][k] + " ");
				}
			System.out.println();
			}
		System.out.println();
		}
	}
}
