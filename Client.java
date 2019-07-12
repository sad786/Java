import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Client 
{
	public static void main(String args[])throws Exception
	{
		DatagramSocket receiver = new DatagramSocket(9999);
		byte b[] = new byte[1024];
		DatagramPacket dp = new DatagramPacket(b,1024);
		
		receiver.receive(dp);
		
		String message = new String(dp.getData());
		
		System.out.println("Server Says ->"+message);
		
		receiver.close();
	}
}