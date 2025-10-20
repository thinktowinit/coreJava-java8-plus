package com.java18;

public class PatternMatchingSwitch {

    public static void describeObject(Object obj) {
        switch (obj) {
            case String s -> System.out.println("It's a string: " + s);
            case Integer i when i > 10 -> System.out.println("Large integer: " + i);
            case Integer i -> System.out.println("Integer: " + i);
            case Double d -> System.out.println("Double value: " + d);
            case null -> System.out.println("Null value");
            default -> System.out.println("Unknown type: " + obj);
        }
    }
    
    public static void describeObjectBeforeJava18(Object obj) {
        if (obj == null) {
            System.out.println("Null value");
            return;
        }

        String type = obj.getClass().getSimpleName(); // Get class name

        switch (type) {
            case "String":
                String s = (String) obj;
                System.out.println("It's a string: " + s);
                break;

            case "Integer":
                Integer i = (Integer) obj;
                if (i > 10) {
                    System.out.println("Large integer: " + i);
                } else {
                    System.out.println("Integer: " + i);
                }
                break;

            case "Double":
                Double d = (Double) obj;
                System.out.println("Double value: " + d);
                break;

            default:
                System.out.println("Unknown type: " + obj);
        }
    }

    public static void main(String[] args) {
    	
        describeObject("Hello");
        describeObject(42);
        describeObject(5);
        describeObject(3.14);
        describeObject(null);
        describeObject(true);
        
        describeObjectBeforeJava18("Hello");
    }
}
