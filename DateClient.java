import java.net.Socket;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.DataInputStream;
import java.io.PrintWriter;

public class DateClient
{
	public static void main(String args[])throws Exception
	{
		Socket socket = new Socket("localhost",1023);
		
		OutputStream in = socket.getOutputStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(in);
		
		//read the date from the socket
		String line ="";
		while(!line.equalsIgnoreCase("bye"))
		{
			line = br.readLine();
			out.println(line);
			
			//close the socket connection
			socket.close();
		}
	}
}