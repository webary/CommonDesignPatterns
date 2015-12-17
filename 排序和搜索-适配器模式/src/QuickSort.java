public final class QuickSort 
{
	public static int partition(int[] a, int f, int b) {
        int pivot = a[f];
        while (f < b) {
            while (f < b && a[b] >= pivot) {
                b--;
            }
            while (f < b && a[f] < pivot) {
                f++;
            }
            if (f < b) {
                int tmpB = a[b];
                a[b] = a[f];
                a[f] = tmpB;
            }
        }       
        return b;
    }
    public static void quickSort2(int[] a, int f, int b) {
        if (f < b) {
            int division = partition(a, f, b);
            quickSort2(a, f, division);
            quickSort2(a, division + 1, b);
        }
    }
	public static void quickSort1(int[] arr, int low, int high) {
        int i = 0, j, key = 0;
        if (low < high) {
            key = arr[low];
            i = low;
            j = high;
            while (i < j) {
                while (i < j && arr[j] > key)
                    j--;
                if (i < j)
                    arr[i++] = arr[j];
                while (i < j && arr[i] < key)
                    i++;
                if (i < j)
                    arr[j--] = arr[i];
            }
        }
        arr[i] = key;
        if (i > low + 1)
            quickSort1(arr, low, i - 1);
        if (i < high - 1)
            quickSort1(arr, i + 1, high);
    }
	public void quickSort(int[] arr){
		quickSort1(arr,0,arr.length-1);
		//quickSort2(arr,0,arr.length-1);
	}
}