package com.anhnbt;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("https://anhnbt.com/");
			
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			
			for (int i = 0; i < httpURLConnection.getHeaderFields().size(); i++) {
				System.out.println(httpURLConnection.getHeaderFieldKey(i) + " = " +httpURLConnection.getHeaderField(i));
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
