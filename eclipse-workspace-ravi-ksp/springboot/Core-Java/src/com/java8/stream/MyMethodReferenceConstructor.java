package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyMethodReferenceConstructor {
	
	public static void main(String[] args) {
		
		
		  List<String> listOfNames = Arrays.asList("Alice", "Bob", "Charlie");

	        // Using constructor reference, converting list of strings in to list of
		  //person objects by setting person name as this tring
		  //4. Method reference to a constructor – Class::new
	        List<Person> people = listOfNames.stream()
	                                   .map(Person::new)  // Constructor reference
	                                   .collect(Collectors.toList());
	        
	        
	        List<Person> listOfPerson = listOfNames.stream()
                    .map(singleName -> new Person(singleName))  //lamda
                    .collect(Collectors.toList());
	        
	        
	        for(Person p : listOfPerson) {
	        	if(p.getName() != null) {
	        		
	        		//from java 8 not to check developer not null, 
	        	}
	        }
		
	}

}





 class Person {
    private String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Created Person: " + name);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
   
    
    
}
