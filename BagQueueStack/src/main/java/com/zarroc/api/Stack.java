package com.zarroc.api;

/**
 * Stack API allows clients to make stacks for any type of data, and supports
 * client use of foreach to iterate through the stack items in LIFO order.This
 * Interface represents the list of operations available for Stack Data
 * structure
 * <p>
 * This API was designed as per algorithm 1.1 on Page 140 of Algorithm,4th
 * Edition.
 * 
 * @author zarroc
 * @param <T>
 */
public interface Stack<T> extends Iterable<T> {

	/**
	 * Adds an object of type <T> to the stack ]
	 * 
	 * @param object
	 *            object to add
	 * @return boolean true if object is added successfully
	 *         <p>
	 *         false if object is not added
	 *         </p>
	 */
	public boolean push(T object);

	/**
	 * returns the last object from stack. If stack is empty RuntimeException is
	 * thrown
	 * 
	 * @return T if stack is not Empty
	 *         <p>
	 *         {@link RuntimeException} if stack is empty
	 *         </p>
	 */
	public T pop();

	/**
	 * Checks whether Stack is empty
	 * 
	 * @return
	 *         <p>
	 *         Returns true if stack is not empty
	 *         </p>
	 *         <p>
	 *         Returns false if stack is empty
	 *         </p>
	 */
	public boolean isEmpty();

	/**
	 * Returns the size of the stack
	 * 
	 * @return
	 *         <p>
	 *         Returns integer representing the number of Elements in stack
	 *         </p>
	 */
	public int size();
}