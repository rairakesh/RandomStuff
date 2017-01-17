/**
 * 
 */
package com.src.siyonllc.randomstuffpatternsexamples.builderpattern;

/**
 * @author Rakesh Rai
 *
 */
public class PhoneBuilder {

	private String os;
	private int ram;
	private String processor;
	private String screenSize;
	private String battery;
	
	/**
	 * @param os the os to set
	 */
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	/**
	 * @param ram the ram to set
	 */
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	/**
	 * @param processor the processor to set
	 */
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	/**
	 * @param screenSize the screenSize to set
	 */
	public PhoneBuilder setScreenSize(String screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	/**
	 * @param battery the battery to set
	 */
	public PhoneBuilder setBattery(String battery) {
		this.battery = battery;
		return this;
	}
	
	
	/**
	 * getPhone to return new instance of Phone.
	 */
	public Phone getPhone() {
		return new Phone(os, ram, processor, screenSize, battery);
	}
	
}
