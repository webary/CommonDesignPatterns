public class BMPFile implements ImageFile
{
	public void decode(String os, String fileName)
	{
		System.out.println("正在"+os+"平台上处理‘bmp’格式图像文件\""+fileName+".bmp\"");
	}
}