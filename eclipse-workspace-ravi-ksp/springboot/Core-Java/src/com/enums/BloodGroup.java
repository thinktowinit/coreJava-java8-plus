package com.enums;

public enum BloodGroup {
	
	O_NEGATIE("o negatie", 10000), 
	O_POSSITIE("o possitie", 1000);   
	  
	public int price;  
	public String bloodGroup;  
	BloodGroup(String bloodGroup, int price){  
	this.price=price;  
	this.bloodGroup=bloodGroup;  
	}  
}


 
