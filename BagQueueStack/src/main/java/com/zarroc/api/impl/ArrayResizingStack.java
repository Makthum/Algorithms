package com.zarroc.api.impl;

import java.util.Iterator;

import com.zarroc.api.Stack;

/**
 * This class implements Stack API using Arrays. It handles dynamic resizing of
 * Arrays. It doubles it size when it is full and it shrinks to half when only
 * 1/4 of its actual size is used.
 * 
 * 
 * @author zarroc
 * @param <T>
 *
 */
public class ArrayResizingStack<T> implements Stack<T> {

	private int N; // Tracks Number of items in the stack

	private T[] items;

	public ArrayResizingStack() {
		@SuppressWarnings("unchecked")
		T[] items = (T[]) new Object[5];
		N = items.length;
	}

	public Iterator<T> iterator() {
		return new ArrayResizingStackIterator();
	}

	public boolean push(T object) {
		if (N == items.length)
			resize(2 * N);  // double the size of array when full
		items[N] = object;
		return true;
	}

	public T pop() {
		if (isEmpty())
			throw new RuntimeException("Stack is Empty. Operation Not Supported");
		T it = items[--N];
		items[N] = null; // avoid hanging objects. Loitering
		if (N > 0 && N < items.length / 4) {  // shrink the array to half when its only 1/4 full.
			resize(items.length / 2);
		}
		return it;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	@SuppressWarnings("unchecked")
	private void resize(int size) {
		T[] newArray = (T[]) new Object[size]; // Java doesn't allow generic
											   // array creation directly
		for (int i = 0; i < items.length; i++) {
			newArray[i] = items[i];
		}
		items = newArray;
	}

	private class ArrayResizingStackIterator implements Iterator<T> {

		private int i = N;

		public boolean hasNext() {
			return i > 0;
		}

		public T next() {
			return (T) items[--i];
		}

	}

}
