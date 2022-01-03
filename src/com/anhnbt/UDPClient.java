package com.anhnbt;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress inetAddress;
		try {
			inetAddress = InetAddress.getByName("localhost");
			
			DatagramSocket socket = new DatagramSocket(3000, inetAddress);
			
			byte[] buf = new byte[1024];
			
			DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
			socket.receive(datagramPacket);
			
			String str = new String(datagramPacket.getData(), 0, buf.length);
			
			System.out.println(str);
			
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
