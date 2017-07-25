/**
 * 
 */
package com.src.siyonllc.randomexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Rakesh Rai
 *
 */
public class CollectionsSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Integer a = new Integer(1);
	        Set<Integer> numbers = new HashSet<>();
	        numbers.add(4);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	        numbers.add(new Integer(6));
	        numbers.add(a);
	        List sortedList = new  ArrayList(numbers);
	        Collections.sort(sortedList, Collections.reverseOrder());
	        System.out.println(sortedList);
	        // Output will be :[6, 5, 4, 3, 1]

	}

}
