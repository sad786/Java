import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
public class Server
{
	public static void main(String args[])throws Exception
	{
		DatagramSocket sender = new DatagramSocket();
		
		String message = "Hello Client";
		byte b[]  = message.getBytes();
		InetAddress inet = InetAddress.getLocalHost();
		DatagramPacket dp = new DatagramPacket(b,message.length(),inet,9999);
		
		sender.send(dp);
		
		sender.close();
		
	}
}