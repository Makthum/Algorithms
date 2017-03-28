package com.zarroc.api;

public interface PriorityQueue<Item extends Comparable<Item>> {

	public void insert(Item c);

	public Item get();
	
	public int size();
	
	public boolean isEmpty();

}
