public abstract class OSVersion
{
	protected ImageFile imgFile;
	public void setImgFile(ImageFile img){
		imgFile = img;
	}
	public abstract void deal(String ImageName);
} 