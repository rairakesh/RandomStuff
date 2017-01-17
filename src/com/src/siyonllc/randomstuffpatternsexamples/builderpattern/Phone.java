/**
 * 
 */
package com.src.siyonllc.randomstuffpatternsexamples.builderpattern;

/**
 * @author Rakesh Rai
 *
 */
public class Phone {

	private String os;
	private int ram;
	private String processor;
	private String screenSize;
	private String battery;

	public Phone(String os, int ram, String processor, String screenSize, String battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}

}
