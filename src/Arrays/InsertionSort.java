package Arrays;
//sorting string and integer arrays using insertionsort
public class InsertionSort
{
	public static void main(String[] args)
	{
		int a[]= {45,2,30,13,23,78,90,12,5};
		for(int i=1;i<a.length;i++)    //int array sorting
		{
			int temp=a[i];
			int j=i;
			while(j>0 && a[j-1] > temp)
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]= temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
