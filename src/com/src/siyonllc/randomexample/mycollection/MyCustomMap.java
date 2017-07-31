/**
 * 
 */
package com.src.siyonllc.randomexample.mycollection;

/**
 * @author Rakesh Rai
 *
 */
public class MyCustomMap<K, V> {
	private int capacity = 100;
	private int size = 0;
	private MyCustomEntry<K, V> table[] = new MyCustomEntry[capacity];

	/**
	 * 
	 * @param hashCode
	 * @return
	 */
	private int Hashing(int hashCode) {
		int location = hashCode % capacity;
		System.out.println("Location:" + location);
		return location;
	}

	/**
	 * 
	 * @return
	 */
	public int size() {
		return this.size;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (this.size == 0) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public boolean containsKey(Object key) {
		if (key == null) {
			if (table[0].getKey() == null) {
				return true;
			}
		}
		int location = Hashing(key.hashCode());
		MyCustomEntry<K, V> e = null;
		try {
			e = table[location];
		} catch (NullPointerException ex) {

		}
		if (e != null && e.getKey() == key) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public boolean containsValue(Object value) {
		for (int i = 0; i < table.length; i++) {
			if (table[i] != null && table[i].getVal() == value) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public V get(K key) {
		V ret = null;
		if (key == null) {
			MyCustomEntry<K, V> e = null;
			try {
				e = table[0];
			} catch (NullPointerException ex) {

			}
			if (e != null) {
				return e.getVal();
			}
		} else {
			int location = Hashing(key.hashCode());
			MyCustomEntry<K, V> e = null;
			try {
				e = table[location];
			} catch (NullPointerException ex) {

			}
			if (e != null && e.getKey() == key) {
				return e.getVal();
			}
		}
		return ret;
	}

	/**
	 * 
	 * @param key
	 * @param val
	 * @return
	 */
	public V put(K key, V val) {
		V ret = null;
		if (key == null) {
			ret = putForNullKey(val);
			return ret;
		} else {
			int location = Hashing(key.hashCode());
			if (location >= capacity) {
				System.out.println("Rehashing required");
				return null;
			}
			MyCustomEntry<K, V> e = null;
			try {
				e = table[location];
			} catch (NullPointerException ex) {

			}
			if (e != null && e.getKey() == key) {
				ret = e.getVal();
			} else {
				MyCustomEntry<K, V> eNew = new MyCustomEntry<K, V>();
				eNew.setKey(key);
				eNew.setVal(val);
				table[location] = eNew;
				size++;
			}
		}
		return ret;
	}

	/**
	 * 
	 * @param val
	 * @return
	 */
	private V putForNullKey(V val) {
		MyCustomEntry<K, V> e = null;
		try {
			e = table[0];
		} catch (NullPointerException ex) {

		}
		V ret = null;
		if (e != null && e.getKey() == null) {
			ret = e.getVal();
			e.setVal(val);
			return ret;
		} else {
			MyCustomEntry<K, V> eNew = new MyCustomEntry<K, V>();
			eNew.setKey(null);
			eNew.setVal(val);
			table[0] = eNew;
			size++;
		}
		return ret;
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public V remove(K key) {
		int location = Hashing(key.hashCode());
		V ret = null;
		if (table[location].getKey() == key) {
			for (int i = location; i < table.length; i++) {
				table[i] = table[i + 1];
			}
		}
		return ret;
	}
}
