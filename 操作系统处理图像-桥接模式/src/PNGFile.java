public class PNGFile implements ImageFile
{
	public void decode(String osType, String fileName)
	{
		System.out.println("在"+osType+"平台平台上处理‘png’格式图像文件\""+fileName+".png\"");
	}
}