package Arrays;

public class HeapSort
{
	public static void main(String[] args)
	{
		int[] a= {22,13,17,11,10,14,12};
		HeapSort hs=new HeapSort();
		hs.sort(a);
		
		for(int i:a) //it will print the sorted array
		{
			System.out.print(i+ " ");
		}
	}
	void sort(int[] a)
	{
		int l=a.length;
		
		for(int i=l/2-1; i >=0; i--)
		{
			heapify(a, l, i);
		}
		for(int i=l-1; i >=0; i--) //swap the elements and heapify again
		{
			int temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			
			heapify(a, i, 0);
		}
	}
	void heapify(int[] a, int n, int i)
	{
		int largest=i;  //parent node index position
		int left=2*i+1; //left child node index position
		int right=2*i+2;//right child node index position
		
		if(left < n && a[left] > a[largest])
		{
			largest=left;
		}
		if(right < n && a[right] > a[largest])
		{
			largest=right;
		}
		if(largest!=i)
		{
			int temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
		}
	}
}
