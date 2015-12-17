public class Client
{
	public static void main(String args[])
	{
		DataOperation dataOp=(DataOperation)XMLUtil.getBean();
		int arr[] = {1,4,5,2,3,7,6,0,8} , i;
		System.out.println("排序前数组为：");
		for(i=0;i<arr.length;++i)
			System.out.print(arr[i] + "  ");
		System.out.println("\n对数组进行排序！");
		dataOp.sort(arr);
		System.out.println("\n排序后数组为：");
		for(i=0;i<arr.length;++i)
			System.out.print(arr[i] + "  ");
		System.out.println("\n\n从-2开始依次查找到"+arr.length+"\n");
		for(i=-2;i<arr.length+1;++i){
			int value = i;
			int index = dataOp.search(arr,value);
			if(index>=0)
				System.out.println("排序后"+value+"是数组的第"+(dataOp.search(arr,value)+1)+"个元素");
			else
				System.out.println("数组中无值为"+value+"的元素！");
				
		}
	}
}


