public class Client
{
	public static void main(String args[])
	{
		DataOperation dataOp=(DataOperation)XMLUtil.getBean();
		int arr[] = {1,4,5,2,3,7,6,0,8} , i;
		System.out.println("����ǰ����Ϊ��");
		for(i=0;i<arr.length;++i)
			System.out.print(arr[i] + "  ");
		System.out.println("\n�������������");
		dataOp.sort(arr);
		System.out.println("\n���������Ϊ��");
		for(i=0;i<arr.length;++i)
			System.out.print(arr[i] + "  ");
		System.out.println("\n\n��-2��ʼ���β��ҵ�"+arr.length+"\n");
		for(i=-2;i<arr.length+1;++i){
			int value = i;
			int index = dataOp.search(arr,value);
			if(index>=0)
				System.out.println("�����"+value+"������ĵ�"+(dataOp.search(arr,value)+1)+"��Ԫ��");
			else
				System.out.println("��������ֵΪ"+value+"��Ԫ�أ�");
				
		}
	}
}


