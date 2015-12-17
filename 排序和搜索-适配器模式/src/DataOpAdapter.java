public class DataOpAdapter implements DataOperation
{
	private static QuickSort quick_sort = new QuickSort();
	private static BinarySearch bin_search = new BinarySearch();
	
	public void sort(int arr[])
	{
		quick_sort.quickSort(arr);
	}
	public int search(int arr[], int value)
	{
		return bin_search.binarySearch(arr,value);
	}
}