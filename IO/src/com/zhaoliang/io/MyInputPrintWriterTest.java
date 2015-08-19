package com.zhaoliang.io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Scanner;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class MyInputPrintWriterTest {

	public static void main(String[] args) throws IOException {
		
		String urlString = "http://www.baidu.com";
		URL url = new URL(urlString);
		
		InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
		
		//f法第三方士大夫是打发撒旦法士大夫放发士大夫是打发
		FileOutputStream out = new FileOutputStream("F:/test/test.txt");
		DataOutputStream dataOutputStream = new DataOutputStream(out);
		
		char[] chars = new char[2048];
		int len = 0;
		while ((len = inputStreamReader.read(chars)) != -1) {
			
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append(chars);
			dataOutputStream.writeChars(stringBuffer.toString());
			System.out.println(stringBuffer.toString());
		}
		
	}
}
