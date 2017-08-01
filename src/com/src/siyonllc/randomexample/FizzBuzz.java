/**
 * 
 */
package com.src.siyonllc.randomexample;

/**
 * @author Rakesh Rai
 *
 *         Test divisible by 3 and 5 first.
 */
public class FizzBuzz {

	public static String fizzBuzz(int number) {
		if (number % 15 == 0) {
			return "FizzBuzz";
		} else if (number % 5 == 0) {
			return "Buzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		}
		// Return the number as is if not divisible by either 5 or 3.
		return String.valueOf(number);
	}

	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			System.out.println(fizzBuzz(i));
		}
	}
}
