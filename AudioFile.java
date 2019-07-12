import java.io.*;
import java.net.*;
public class AudioFile
{
	public static void main(String args[])throws Exception
	{
		var url = new URL(args[0]);
		var con = url.openConnection();
		var fin = new BufferedInputStream(url.openStream());
		
		var fot = new ByteArrayOutputStream();
		var out = new FileOutputStream("phtot.jpg");
		
		System.out.println("Content Type "+con.getContentType());
		System.out.println("Content Lenth "+con.getContentLength());
		System.out.println("Content is "+con.getContent());
		int data = 0;
		//while((data = fin.read())!=-1)
			//fot.write(data);
		byte b[] = fot.toByteArray();
		out.write(b);
		fin.close();
		//fot.close();
		System.out.println("Successfully Created....");
	}
}