package com.anhnbt;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("https://anhnbt.com/");
			
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getFile());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
