package com.anhnbt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	public static void main(String[] args) {
		ServerSocket serverSocket;
		try {
			System.out.println("Start socket");
			serverSocket = new ServerSocket(3333);
			
			Socket socket = serverSocket.accept();
			
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			
			try (Scanner scanner = new Scanner(System.in)) {
				while (true) {
					// Doc du lieu tu client truyen len
					String str = dataInputStream.readUTF();
					if (str.equalsIgnoreCase("q")) {
						break;
					}
					System.out.println("Client say: " + str);
					// Truyen du lieu tu server ve
					String str2 = scanner.nextLine();
					dataOutputStream.writeUTF(str2);
					dataOutputStream.flush();
				}
			}
			
			dataInputStream.close();
			dataOutputStream.close();
			socket.close();
			System.out.println("Close socket");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
