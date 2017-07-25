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
public class CollectionsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 List<Employee> employees = new ArrayList<Employee>();
		 Employee e1 = new Employee();
				 
		 employees.add(new Employee("paul"));
		 employees.add(new Employee("john"));
		 employees.add(new Employee("George"));
		 employees.add(new Employee("Ringo"));
		 
		 // For the below exception, To avoid : Exception in thread "main" java.util.ConcurrentModificationException
		 // do not iterate, simply use new ArrayList to add
		 for(Employee e : employees) {
			 if(e.getName() == "John");
			 employees.remove(e);
		 }
		 
		 System.out.println(employees);
		 
	}
	
}
