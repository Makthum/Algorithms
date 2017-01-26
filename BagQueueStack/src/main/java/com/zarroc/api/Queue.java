package com.zarroc.api;

/**
 * The {@code Queue} class represents a first-in-first-out (FIFO) queue of
 * generic items. It supports the usual <em>enqueue</em> and <em>dequeue</em>
 * operations, along with methods for peeking at the first item, testing if the
 * queue is empty, and iterating through the items in FIFO order.
 * <p>
 * This implementation uses a singly-linked list with a static nested class for
 * linked-list nodes. See {@link LinkedQueue} for the version from the textbook
 * that uses a non-static nested class. The <em>enqueue</em>, <em>dequeue</em>,
 * <em>peek</em>, <em>size</em>, and <em>is-empty</em> operations all take
 * constant time in the worst case.
 * <p>
 * For additional documentation, see
 * <a href="http://algs4.cs.princeton.edu/13stacks">Section 1.3</a> of
 * <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 * @author zarroc
 *
 * @param <Item>
 *            the generic type of an item in this queue
 */
public interface Queue<item> extends Iterable<item> {

	/**
	 * Adds an object to the queue using LIFO mechanism
	 * 
	 * @param object
	 *            to add
	 */
	public void enqueue(item object);

	/**
	 * Removes & Returns an object from the queue based on LIFO mechanism
	 * 
	 * @return removed item from the queue
	 */
	public item dequeue();

	/**
	 * Returns size of the queue
	 * 
	 * @return integer value representing size of the queue returns 0 when queue
	 *         is empty
	 */
	public int size();

	/**
	 * Return true when queue is empty
	 * 
	 * @return boolean
	 */
	public boolean isEmpty();

	/**
	 * Returns the next item on the queue. Does not remove the item from the
	 * list
	 * 
	 * @return item next on the queue
	 * @throws RuntimeException
	 *             if queue is empty
	 */
	public item peek();

}
