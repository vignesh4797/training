package com.kctech.daythree;

import java.util.*;


public class Comparatorv {

	String name ;
	int id ;
	
	
	public Comparatorv(String  String, int i )
	{
		this.name = String;
		this.id = i;
		
	}
	
	
	public static void main(String[] args) {
		
		Comparatorv  em= new Comparatorv("vicky", 123);
        Comparatorv  em1= new Comparatorv("sss", 123);
        
        
        Set employees = new HashSet();
        employees.add(em);
        employees.add(em1);
        System.out.println(employees);
        
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		
		Comparatorv other = (Comparatorv) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "name=" + name + ", id=" + id ;
	}


	

}
