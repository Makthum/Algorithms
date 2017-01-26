package com.zarroc.api.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.zarroc.api.Queue;

/**
 * The {@code ResizingArrayQueue} class represents a first-in-first-out (FIFO)
 * queue of generic items. It supports the usual <em>enqueue</em> and
 * <em>dequeue</em> operations, along with methods for peeking at the first
 * item, testing if the queue is empty, and iterating through the items in FIFO
 * order.
 * <p>
 * This implementation uses a resizing array, which double the underlying array
 * when it is full and halves the underlying array when it is one-quarter full.
 * The <em>enqueue</em> and <em>dequeue</em> operations take constant amortized
 * time. The <em>size</em>, <em>peek</em>, and <em>is-empty</em> operations
 * takes constant time in the worst case.
 * <p>
 * For additional documentation, see
 * <a href="http://algs4.cs.princeton.edu/13stacks">Section 1.3</a> of
 * <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 * 
 * @author zarroc
 *
 * @param <Item>
 */
public class ArrayResizingQueue<Item> implements Queue<Item> {
	private int head;
	private int tail;
	@SuppressWarnings("unchecked")
	private Item[] items = (Item[]) new Object[1];

	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	public void enqueue(Item object) {
		if (tail >= items.length)
			resize(items.length * 2);
		items[tail++] = object;
	}

	public Item dequeue() {
		if (isEmpty())
			throw new NoSuchElementException();
		Item temp = items[head];
		items[head++] = null;
		if (((tail - head) > 0) && ((tail - head) == items.length / 4))
			resize(items.length / 2);
		return temp;
	}

	public int size() {
		return tail - head;
	}

	public boolean isEmpty() {
		return (tail - head) == 0;
	}

	public Item peek() {
		return null;
	}

	private void resize(int size) {
		@SuppressWarnings("unchecked")
		Item[] temp = (Item[]) new Object[size];
		for (int i = 0; i < tail - head; i++) {
			temp[i] = items[head + i];
		}
		items = temp;
		tail = tail - head;
		head = 0;

	}

	private class ListIterator implements Iterator<Item> {

		private int i = head;

		public boolean hasNext() {
			return i > 0;
		}

		public Item next() {
			return items[i++];
		}

	}

}
