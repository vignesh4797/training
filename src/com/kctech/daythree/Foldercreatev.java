package com.kctech.daythree;
import java.io.File;

public class Foldercreatev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		File rr =new File("/Users/admin/Desktop/vignesh");
		boolean value = rr.exists();
		System.out.println(value);
		
		if(value==false){
			
		rr.mkdir();	
			
		}
	}

}
