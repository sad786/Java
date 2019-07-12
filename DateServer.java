import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class DateServer
{
	public static void main(String args[]) throws Exception
	{
		//Creating the Date Server
		ServerSocket sc = new ServerSocket(1023);
		
		while(true)
		{
			Socket client = sc.accept();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			System.out.println("Server says :"+br.readLine());
			
			//close the socket and resurme
			//listening for connections
			
			client.close();
		}
	}
}