public class JPGFile implements ImageFile
{
	public void decode(String osType, String fileName)
	{
		System.out.println("在"+osType+"平台上处理‘jpg’格式图像文件\""+fileName+".jpg\"");
	}
}