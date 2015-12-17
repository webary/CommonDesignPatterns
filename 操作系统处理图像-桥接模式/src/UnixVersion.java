public class UnixVersion extends OSVersion
{
	public void deal(String imageName)
	{
		this.imgFile.decode("Unix",imageName);
	}
}