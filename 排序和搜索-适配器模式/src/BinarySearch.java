public final class BinarySearch
{
	public int binarySearch(int[] arr,int value){
		int l = 0, h = arr.length-1, m = h/2;
		while(value!=arr[m])
		{
			if(l>=h)
				return -1;
			if(value<arr[m])
			{
				h = m-1;
				m = (h+l)/2;
			}
			else
			{
				l = m+1;
				m = l + (h-l)/2;
			}
		}
		return m;
	}
}


