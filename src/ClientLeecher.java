import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ClientLeecher {
	
	//Data grams for sending packets of data and socket
	private static DatagramPacket ReceivePacket= null;
	private static DatagramSocket ReceiveSocket= null;
	
	public static String ReceiveUdpData() throws IOException {
		
		String feedback="";
		
		try {
			
			byte[] ReceiveData = new byte[1024];
			
			ReceivePacket = new DatagramPacket(ReceiveData, ReceiveData.length );
			
			ReceiveSocket = new DatagramSocket(2024);
			
			ReceiveSocket.receive(ReceivePacket);
			
			feedback = new String(ReceivePacket.getData());
			
			
		}catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return feedback;
		
	}
			
	public ClientLeecher() {
		// TODO Auto-generated constructor stub
	}

}
