package com.nec.javabasics;

public class Bird {
                //properties
	            public static int breaks;
	            public static int legs;
	            String name;
	            String colour;
	            
	            public Bird()
	            {
	            	breaks=1;
	            	legs=2;
	            }
	            //create method
	            public void walk()
	            {
	            	System.out.println("walk properly");
	            }
	            public static void fly() {
	            	System.out.println("flying...");
	            }
	            public void sing() {
	            	System.out.println("sing");
	            }
}
