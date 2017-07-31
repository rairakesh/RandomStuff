/**
 * 
 */
package com.src.siyonllc.randonexample.binarytodecimal;

import java.util.Scanner;

/**
 * @author Rakesh Rai
 *
 */
public class BinaryToDecimalUsingParseInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		String binaryString = input.nextLine();
		System.out.println("Output: " + Integer.parseInt(binaryString, 2));
	}

}
