package com.anhnbt;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress address = InetAddress.getByName("https://google.com.vn/");
			
			System.out.println(address.getHostAddress());
			System.out.println(address.getHostName());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
