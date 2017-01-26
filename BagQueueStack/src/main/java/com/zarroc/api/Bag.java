package com.zarroc.api;

/**
 * The Bag class represents a bag (or multiset) of generic items. It supports
 * insertion and iterating over the items in arbitrary order. This
 * implementation uses a singly-linked list with a static nested class Node. See
 * LinkedBag for the version from the textbook that uses a non-static nested
 * class. The add, isEmpty, and size operations take constant time. Iteration
 * takes time proportional to the number of items.
 * 
 * For additional documentation, see Section 1.3 of Algorithms, 4th Edition by
 * Robert Sedgewick and Kevin Wayne.
 * 
 * @author zarroc
 *
 * @param <Item>
 */
public interface Bag<Item> extends Iterable<Item> {

	/**
	 * Add an item to the collection
	 * 
	 * @param item
	 */
	public void add(Item item);

	/**
	 * Returns the size of the collections
	 * 
	 * @return
	 */
	public int size();

	/**
	 * Returns true if bag is empty
	 * 
	 * @return True when bag is empty
	 */
	public boolean isEmpty();

}
