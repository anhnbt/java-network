package com.anhnbt;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Connection socket");
			Socket socket = new Socket("localhost", 3333);
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			
			Scanner scanner = new Scanner(System.in);
			
			while (true) {
				// Truyen du lieu len server
				String str = scanner.nextLine();
				dataOutputStream.writeUTF(str);
				if (str.equalsIgnoreCase("q")) {
					break;
				}
				
				// Doc du lieu tu server
				String str2 = dataInputStream.readUTF();
				System.out.println("Server say: " + str2);
			}
			System.out.println("Disconnect socket");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
