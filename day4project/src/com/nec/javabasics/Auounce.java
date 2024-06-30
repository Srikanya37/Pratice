package com.nec.javabasics;

public interface Auounce {
	void broadCast();
}
interface BookingCounter{
	Ticket getTicket(String ticketClass);
}
class Ticket{
	//no-arg constructor
	Ticket(){}
	//constuctor overload-parameterized constuctor
	Ticket(String ticketClass){
		System.out.println(ticketClass);
	}
}
public class Mymethodrefs {
	//define static method
	public static void greetMembers() {
		System.out.println("Welcome to the session");
	}
	//define non-static method 
	public void introduction() {
		System.out.println("Today's objectives...");
	}
	public static void main(String[] args) {
		//Mymethodrefs.greetMembers();
		//1.refernce to a static method
		Anounce greeting=Mymethodrefs::greetMembers;
		
		greeting.broadCast();
		
		//2.reference to a non-static method 
				//create instance of the class
				Mymethodrefs instance=new Mymethodrefs();
				
				Anounce introduce=instance::introduction;
				
				introduce.broadCast();
				
				//3.reference to constructor
				
				Ticket t=new Ticket();
				Ticket myticket=t;
				BookingCounter counter=Ticket::new;
				
				counter.getTicket("First:class");	
			}
		}