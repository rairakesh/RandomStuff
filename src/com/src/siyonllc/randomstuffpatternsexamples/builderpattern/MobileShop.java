/**
 * 
 */
package com.src.siyonllc.randomstuffpatternsexamples.builderpattern;

/**
 * @author Rakesh Rai
 *
 */
public class MobileShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Phone ph = new Phone("Iphone", 36, "Intel", "5.6", "3000");
		System.out.println("Phone type is :" + ph);
		
		
		Phone phBuilder = new PhoneBuilder().setOs("Iphone").setProcessor("Intel").setBattery("3000").getPhone();
		System.out.println("Phone using Builder is :" + phBuilder);
		
	}

}
