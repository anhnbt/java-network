package com.anhnbt;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket datagramSocket = new DatagramSocket();
			
			InetAddress ip = InetAddress.getByName("localhost");
			
			String str = "Xin chao AnhNBT";
			
			DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
			
			datagramSocket.send(datagramPacket);
			datagramSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
