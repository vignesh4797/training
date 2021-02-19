package com.kctech.daythree;


import java.io.File;

import java.io.FileWriter;
import java.io.IOException;


public class Filewrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File word = new File ("/Users/admin/Desktop/vignesh/vi.txt");
		boolean check = word.exists();	
		System.out.println(check);
		
		if (check==false)
		{
			try {
				word.createNewFile();
				FileWriter writer = new FileWriter(word);
				writer.write("how are you");
				writer.flush();
				writer.close();
				
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
