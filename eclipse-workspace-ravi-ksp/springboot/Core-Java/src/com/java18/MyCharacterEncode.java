package com.java18;

import java.nio.charset.Charset;

public class MyCharacterEncode {
    public static void main(String[] args) {
    	String x = "abc";  //byte format
        System.out.println("Default Charset: " + Charset.defaultCharset());
    }
}