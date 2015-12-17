import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class XMLUtil
{
//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getBean(String args)
	{
		try
		{
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc = builder.parse(new File("config.xml")); 
			
			//获取包含类名的文本节点
			NodeList nl = null;
			if(args.equals("ImageFile"))
			{
	            nl = doc.getElementsByTagName("ImageFile");
			}
			else if(args.equals("OSVersion"))
			{
	            nl = doc.getElementsByTagName("OSVersion");
			}
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();
	        //通过类名生成实例对象并将其返回
	        Class<?> c = Class.forName(cName);
		  	Object obj = c.newInstance();
	        return obj;		
        }
        catch(Exception e)
        {
           	e.printStackTrace();
           	return null;
        }
	}
}
