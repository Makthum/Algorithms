package com.zarroc.api.impl;

import java.util.Iterator;

import com.zarroc.api.Bag;

public class LinkedBag<Item> implements Bag<Item> {

	private Node head;
	private int size;

	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	public void add(Item item) {
		Node temp = new Node();
		temp.item = item;
		temp.next = head;
		head = temp;
		size++;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	private class Node {
		private Item item;
		private Node next;
	}

	private class ListIterator implements Iterator<Item> {

		private Node temp = head;

		public boolean hasNext() {
			return temp != null;
		}

		public Item next() {
			Node val = temp;
			temp = temp.next;
			return val.item;
		}

	}

}
