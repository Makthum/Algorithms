package com.zarroc.api.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.zarroc.api.Stack;

/**
 * This class represents a Implementation of Stack Data Type using Linked Nodes
 * The {@code LinkedStack} class represents a last-in-first-out (LIFO) stack of
 * generic items. It supports the usual <em>push</em> and <em>pop</em>
 * operations, along with methods for peeking at the top item, testing if the
 * stack is empty, and iterating through the items in LIFO order.
 * <p>
 * This implementation uses a singly-linked list with a non-static nested class
 * for linked-list nodes. See {@link Stack} for a version that uses a static
 * nested class. The <em>push</em>, <em>pop</em>, <em>peek</em>, <em>size</em>,
 * and <em>is-empty</em> operations all take constant time in the worst case.
 * <p>
 * For additional documentation, see
 * <a href="http://algs4.cs.princeton.edu/13stacks">Section 1.3</a> of
 * <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 * 
 * @param <T>
 * @author zarroc
 */
public class LinkedStack<T> implements Stack<T> {

	private Node head;
	private int size;

	private class Node {
		private T t;
		private Node next;
	}

	public Iterator<T> iterator() {
		return new ListIterator();
	}

	public boolean push(T object) {
		if (head == null) {
			Node temp = new Node();
			temp.t = object;
			temp.next = null;
			head = temp;
		} else {
			Node temp = new Node();
			temp.t = object;
			temp.next = head;
			head = temp;
		}
		size++;
		return true;
	}

	public T pop() {
		if (head == null)
			throw new RuntimeException();
		Node temp = head;
		head = head.next;
		temp.next = null;
		size--;
		return temp.t;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}

	private class ListIterator implements Iterator<T> {

		private Node temp = head;

		public boolean hasNext() {
			return temp != null;
		}

		public T next() {
			if (!hasNext())
				throw new NoSuchElementException();
			T item = temp.t;
			temp = temp.next;
			return item;
		}

	}
}
