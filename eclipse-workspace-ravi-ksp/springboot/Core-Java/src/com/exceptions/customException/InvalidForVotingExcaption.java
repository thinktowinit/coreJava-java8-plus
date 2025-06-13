package com.exceptions.customException;
//custom exception
public class InvalidForVotingExcaption extends RuntimeException {
	
	//this means, present class object
	//super means, super class object
	InvalidForVotingExcaption(String customMessage){
		
		super(customMessage);//send our message in place of java message....
	}
	
	

}
