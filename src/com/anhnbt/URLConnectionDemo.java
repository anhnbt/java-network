package com.anhnbt;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("https://anhnbt.com/");
			URLConnection urlConnection = url.openConnection();
			
			InputStream inputStream = urlConnection.getInputStream();
			
			int i = inputStream.read();
			
			while (i != -1) {
				System.out.print((char) i);
				i = inputStream.read();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
