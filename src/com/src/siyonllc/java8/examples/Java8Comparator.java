/**
 * 
 */
package com.src.siyonllc.java8.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Rakesh Rai
 *
 */
public class Java8Comparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player("Rakesh", "Rai", 11));
		players.add(new Player("Siyona", "Rai", 22));
		players.add(new Player("Sambhavi", "Singh", 33));
		
		ArrayList<Player> players2 = (ArrayList<Player>) players.clone();
		
		// old way
		Comparator<Player> c1= new Comparator<Player>() {
			public int compare(Player p1, Player p2) {
				return p1.lastName.compareTo(p2.lastName);
			}
		};
		Collections.sort(players, c1);
		System.out.println("Sorted Players - old way : " + players);
		
		// New lamda Way
		Comparator<Player> c2 = (Player p1, Player p2) -> p1.lastName.compareTo(p2.lastName);
		Collections.sort(players, c2);
		System.out.println("Sorted Players - New lamda way : " + players);
	}
	
	
	

}
