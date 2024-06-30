package com.nec.javabasics;

public class Addexcep {
	public static void main(String args[]) {
		float a;
		float b;
		float c;
		if(args.length==2) {
			try {
		    a=Integer.parseInt(args[0]);
		    b=Integer.parseInt(args[1]);
		    c=add(a,b);
			}
			catch(NumberFormatException e) {
				a=float.parsefloat(args[0]);
				b=float.parsefloat(args[1]);
				c=add(a,b);
				
			}finally {
				System.out.printl("sum="+c);
			}
			public static int add(int x,int y) {
				c=x+y;
				return c;
			}
			public static float add(float x,float y) {
				c=x+y;
				return c;
			}
		}
	}


