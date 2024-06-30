package com.project3;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class dob {
	public static void main (String[] args) throws IOException{
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("enter your name");
		String st=reader.readLine();
		
		System.out.println("date of the birth:");
		String yr=reader.readLine();
		
		System.out.println("name:"+st);
		System.out.println("happy birthday to you:"+yr);
		reader.close();
		
			
	}
	

}
