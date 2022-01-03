package com.anhnbt;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Clien ket noi");
			try (Socket socket = new Socket("localhost", 6666)) {
				DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
				
				dataOutputStream.writeUTF("Hello AnhNBT");
				
				dataOutputStream.flush();
				
				dataOutputStream.close();
			}
			
			System.out.println("Ket thuc ket noi");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
