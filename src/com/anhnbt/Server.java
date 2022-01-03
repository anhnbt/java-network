package com.anhnbt;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Start Socket");
			try (ServerSocket serverSocket = new ServerSocket(6666)) {
				Socket socker = serverSocket.accept();
				
				DataInputStream dataInputStream = new DataInputStream(socker.getInputStream());
				
				String str = dataInputStream.readUTF();
				System.out.println(str);
				
				dataInputStream.close();
				
				socker.close();
			}
			
			System.out.println("Stop Socket");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
