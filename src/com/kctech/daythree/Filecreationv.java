package com.kctech.daythree;
import java.io.File;
import java.io.IOException;


public class Filecreationv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File word = new File ("/Users/admin/Desktop/vignesh/vicky.txt");
		boolean check = word.exists();	
		System.out.println(check);
		
		if (check==false)
		{
			try {
				word.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
