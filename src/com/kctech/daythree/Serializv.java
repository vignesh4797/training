package com.kctech.daythree;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Serializv implements Serializable {
   
int a;
String b;

Serializv (int a, String b)
{
	
	this.a=a;
	this.b=b;

	}

public static void main(String[] args) throws IOException {
	
	Serializv ob= new Serializv(24,"vignesh");
	
	String filename="/Users/admin/Desktop/vignesh/vi.txt";
	
	FileOutputStream file= new FileOutputStream(filename);
	ObjectOutputStream obj= new ObjectOutputStream(file);
	obj.writeObject(ob);
	
	System.out.println("Serilization sucess");
	
	 // string name =" sony";
	
	//Serializv object1;
}
		
		
		
		

	

}
