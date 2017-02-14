package com.pattern.structural.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DecoratorEveryDayDemo {
	
	public static void main(String[] args) throws IOException {
		File file = new File("./output.txt");
		file.createNewFile();
		
		OutputStream oStream = new FileOutputStream(file);
		
		DataOutputStream doStream = new DataOutputStream(oStream);
		doStream.writeChars("text");
		
		doStream.close();
		oStream.close();
	}
	
}
