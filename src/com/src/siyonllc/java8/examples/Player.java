/**
 * 
 */
package com.src.siyonllc.java8.examples;

/**
 * @author Rakesh Rai
 *
 */
public class Player {

	public String firstName;
	public String lastName;
	public int number;
	
	public Player(String fn, String ln, int n) {
		firstName = fn;
		lastName = ln;
		number = n;
	}
	
	public String toString(){
		return lastName + ", "+ firstName;
	}
}
