package com.kctech.daythree;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;


public class Filereaderv {

	public static void main(String[] args) {
		

		File word = new File ("/Users/admin/Desktop/vignesh/vi.txt");
		boolean check = word.exists();	
		System.out.println(check);
		
		
		try {
			
			@SuppressWarnings("resource")
			FileReader readd = new FileReader(word);
			int output = readd.read();
			
			while(output!=-1)
			{
				System.out.println((char)output);
				output=readd.read();
			}
			
		} 
		
		
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
