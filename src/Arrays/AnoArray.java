package Arrays;
//Gettting the sum of Anonymous arrays by using for-each loop.
public class AnoArray
{
	public static void main(String[] args)
	{
		AnoArray.sum(new int[] {10, 20, 30, 40});  //1D array
		AnoArray.sum(new int[][] {{10, 20, 30},{40, 50, 60}});  //2D array
	}
	static void sum(int[] no)  //sum method for 1D array
	{
		int total=0;
		for(int i:no)  //for-each loop
		{
			total=total+i;
		}
		System.out.println("Sum of 1D array is= " +total);
	}
	static void sum(int[][] no) //sum method for 2D array
	{
		int total=0;
		for(int ii[]:no)  //for-each loop
		{
			for(int i:ii)
			{
				total=total+i;
			}
		}
		System.out.println("Sum of 2D array is= " +total);
	}
	
}
