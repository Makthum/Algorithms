package com.zarroc.api.impl;

import com.zarroc.api.PriorityQueue;

public class MinBinaryHeap<Item extends Comparable<Item>> implements PriorityQueue<Item> {

	private Item[] items;

	private int N;

	public MinBinaryHeap(Item[] items) {
		super();
		this.items = items;
		this.N = 1;
	}

	@SuppressWarnings("unchecked")
	public MinBinaryHeap(int max) {
		items = ((Item[]) new Object[max]);
	}

	private void sink(int i) {
		int j=2*i;
		while(2*i <= this.N){
			if(less(items[j+1],items[j])) j++;
			if(!less(items[i],items[j])) break;
			exch(items[i], items[j]);
			i=j;
		}
	}

	private void swim(int i) {
		while (i > 1 && less(items[i], items[i / 2])) {
			exch(items[i], items[i / 2]);
			i = i / 2;
		}
	}

	public void insert(Item c) {
		if (size() == items.length - 1) {
			throw new IllegalArgumentException();
		} else {
			items[N] = c;
			swim(N);
			N++;
		}

	}

	public Item get() {
		Item temp = items[1];
		exch(items[1], items[N]);
		items[N]=null;
		N--;
		sink(1);
		return temp;
	}

	public int size() {
		return this.N;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.N == 1;
	}

	private boolean less(Item a, Item b) {
		return a.compareTo(b) > 0;
	}

	private void exch(Item a, Item b) {
		Item temp = a;
		a = b;
		b = temp;

	}

}
