package Arrays;
//sorting string and integer arrays using mergesort
public class MergeSort
{
	int[] array;
	int[] tempMergeArr;
	int length;
	public static void main(String[] args)
	{
		int[] inputArr= {45,2,30,13,23,78,90};
		MergeSort ms=new MergeSort();
		ms.sort(inputArr);
		
		for(int i:inputArr) //it will print the sorted array
		{
			System.out.print(i+ " ");
		}
	}
	public void sort(int inputArr[])
	{
		this.array=inputArr;
		this.length=inputArr.length;
		this.tempMergeArr=new int[length];
		divideArray(0, length-1);
	}
	public void divideArray(int lowerIndex, int higherIndex)
	{
		if(lowerIndex<higherIndex)
		{
			int middle=lowerIndex+(higherIndex-lowerIndex)/2;
			divideArray(lowerIndex,middle); //it will sort left side of array
			divideArray(middle+1, higherIndex); //it will sort right side of array
			mergeArray(lowerIndex,middle,higherIndex); //it will merge the array again
		}
	}
	public void mergeArray(int lowerIndex, int middle, int higherIndex)
	{
		for(int i=lowerIndex;i<=higherIndex;i++)
		{
			tempMergeArr[i]=array[i];
		}
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		while(i<=middle && j<=higherIndex)
		{
			if(tempMergeArr[i] <= tempMergeArr[j])
			{
				array[k]=tempMergeArr[i];
				i++;
			}
			else
			{
				array[k]=tempMergeArr[j];
				j++;
			}
			k++;
		}
		while(i <= middle)
		{
			array[k]=tempMergeArr[i];
			k++;
			i++;
		}
	}
}
