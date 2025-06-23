import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class ClientSeeder extends VBox {
	
	//Data grams for sending packets of data and socket
	private static DatagramPacket SendPacket=null;
	private static DatagramSocket SendSocket= null;
	
	private Button button;
	
	private void SeederGUI() {
		
		VBox vbox = new VBox(10);
		
		
	}
	
	//Sending udp data function
	public static void SendUdpData( byte[] SendData) {
		try {
			InetAddress IPaddress = InetAddress.getByName("localhost");
			
			SendPacket = new DatagramPacket(SendData, SendData.length,IPaddress,2024);
			
			SendSocket = new DatagramSocket();
			
			SendSocket.send(SendPacket);
			
		}catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}   

}
