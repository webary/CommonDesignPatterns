public class LinuxVersion extends OSVersion
{
	public void deal(String imageName)
	{
		this.imgFile.decode("Linux",imageName);
	}	
}