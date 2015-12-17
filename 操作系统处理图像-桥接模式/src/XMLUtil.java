import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class XMLUtil
{
//�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
	public static Object getBean(String args)
	{
		try
		{
			//�����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc = builder.parse(new File("config.xml")); 
			
			//��ȡ�����������ı��ڵ�
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
	        //ͨ����������ʵ�����󲢽��䷵��
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
