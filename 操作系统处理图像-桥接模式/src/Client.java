public class Client
{
	public static void main(String[] args)
	{
		ImageFile imageFile = (ImageFile)XMLUtil.getBean("ImageFile");;
		OSVersion os = (OSVersion)XMLUtil.getBean("OSVersion");
		
		os.setImgFile(imageFile);
		os.deal("image1");
	}
}