package com.kctech.daythree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Serializv object1 = null;
		
		//String name=null;
		
		String file2="/Users/admin/Desktop/vignesh/vi.txt";
		
		FileInputStream in = new FileInputStream(file2);
		ObjectInputStream j= new ObjectInputStream(in);
		object1 =(Serializv)j.readObject();
		
	    System.out.println(object1.a);
	    System.out.println(object1.b);
		

	}

}
