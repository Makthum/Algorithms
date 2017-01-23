package com.zarroc.api.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.zarroc.api.Stack;

public abstract class AbstractStackTest {

	protected Stack<Integer> stack = null;

	@Rule
	public ExpectedException expected = ExpectedException.none();

	@Test
	public void ObjectCreation() {
		assertNotNull(this.stack);
	}

	@Test
	public void push() {
		assertNotNull(this.stack);
		assertTrue(this.stack.push(15));
	}

	@Test
	public void pop() {
		assertNotNull(this.stack);
		assertTrue(this.stack.push(15));
		assertEquals(15, this.stack.pop().intValue());
	}

	@Test
	public void isEmpty() {
		assertNotNull(this.stack);
		assertTrue(this.stack.isEmpty());
	}

	@Test
	public void size() {
		assertNotNull(this.stack);
		assertEquals(0, this.stack.size());
	}

	@Test
	public void popOnEmpty() {
		assertNotNull(this.stack);
		assertEquals(0, this.stack.size());
		expected.expect(RuntimeException.class);
		this.stack.pop();
	}

	@Test
	public void iterator() {
		this.stack.push(15);
		this.stack.push(1);
		this.stack.push(5);
		Iterator<Integer> it = this.stack.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	@Test
	public void pushSize() {
		this.stack.push(15);
		this.stack.push(1);
		this.stack.push(5);
		assertEquals(3, this.stack.size());
	}
	
	@Test
	public void pushPopSize() {
		this.stack.push(15);
		this.stack.push(1);
		this.stack.push(5);
		this.stack.pop();
		assertEquals(2, this.stack.size());
	}
	
	@Test
	public void PoptoZero() {
		this.stack.push(15);
		this.stack.push(1);
		this.stack.push(5);
		this.stack.pop();
		this.stack.pop();
		this.stack.pop();
		assertEquals(0, this.stack.size());
	}

}
