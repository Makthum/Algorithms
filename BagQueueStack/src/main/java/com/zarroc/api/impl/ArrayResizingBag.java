package com.zarroc.api.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.zarroc.api.Bag;

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
 * @author Zarroc
 *
 * @param <Item>
 */
public class ArrayResizingBag<Item> implements Bag<Item> {

	private int pointer;
	@SuppressWarnings("unchecked")
	private Item[] items = (Item[]) new Object[1];

	public Iterator<Item> iterator() {
		return new ItemIterator();
	}

	public void add(Item item) {
		if (pointer == items.length)
			resize(2 * items.length);
		items[pointer++] = item;
	}

	public int size() {
		return pointer;
	}

	public boolean isEmpty() {
		return pointer == 0;
	}

	private void resize(int size) {
		@SuppressWarnings("unchecked")
		Item[] temp = (Item[]) new Object[size];
		for (int i = 0; i < items.length; i++) {
			temp[i] = items[i];
		}
		items = temp;
	}

	private class ItemIterator implements Iterator<Item> {

		private int N = pointer;

		public boolean hasNext() {
			return N > 0;
		}

		public Item next() {
			if (!hasNext())
				throw new NoSuchElementException();
			return items[--N];
		}

	}

}
