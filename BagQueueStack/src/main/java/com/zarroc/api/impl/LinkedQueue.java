package com.zarroc.api.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.zarroc.api.Queue;

public class LinkedQueue<Item> implements Queue<Item> {

	private Node head;
	private Node tail;
	private int size;

	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	public void enqueue(Item object) {
		Node temp = new Node();
		temp.item = object;
		temp.next = null;
		if (head == null && tail == null) {
			tail = temp;
			head = temp;
		} else {
			tail.next = temp;
			tail = temp;
		}
		size++;
	}

	public Item dequeue() {
		if (isEmpty())
			throw new NoSuchElementException();
		Node temp = head;
		head = head.next;
		size--;
		if (isEmpty())
			tail = null;
		return temp.item;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public Item peek() {
		if (isEmpty())
			throw new NoSuchElementException();
		return head.item;
	}

	private class ListIterator implements Iterator<Item> {
		private Node temp = head;

		public boolean hasNext() {
			return temp != null;
		}

		public Item next() {
			if (!hasNext())
				throw new NoSuchElementException();
			Node val = temp;
			temp = temp.next;
			return val.item;
		}

	}

	private class Node {
		private Item item;
		private Node next;
	}

}
