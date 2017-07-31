/**
 * 
 */
package com.src.siyonllc.randonexample.binarytodecimal;

/**
 * @author Rakesh Rai
 *
 */
public class BinaryToDecimal {

	public static int getBinaryToDecimal(int binaryNumber) {

		int decimal = 0;
		int p = 0;
		while (true) {
			if (binaryNumber == 0) {
				break;
			} else {
				int temp = binaryNumber % 10;
				decimal += temp * Math.pow(2, p);
				binaryNumber = binaryNumber / 10;
				p++;
			}
		}
		return decimal;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("110 --> " + getBinaryToDecimal(110));
		System.out.println("1101 --> " + getBinaryToDecimal(1101));
		System.out.println("100 --> " + getBinaryToDecimal(100));
		System.out.println("110111 --> " + getBinaryToDecimal(110111));
	}

}
