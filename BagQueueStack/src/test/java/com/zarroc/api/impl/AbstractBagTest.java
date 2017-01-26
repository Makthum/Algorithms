package com.zarroc.api.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.zarroc.api.Bag;

public abstract class AbstractBagTest {

	protected Bag<Integer> Bag = null;

	@Rule
	public ExpectedException expected = ExpectedException.none();

	@Test
	public void ObjectCreation() {
		assertNotNull(this.Bag);
	}

	@Test
	public void push() {
		assertNotNull(this.Bag);
		this.Bag.add(15);
		assertEquals(1, this.Bag.size());
	}

	@Test
	public void isEmpty() {
		assertNotNull(this.Bag);
		assertTrue(this.Bag.isEmpty());
	}

	@Test
	public void size() {
		assertNotNull(this.Bag);
		assertEquals(0, this.Bag.size());
	}

	@Test
	public void iterator() {
		this.Bag.add(15);
		this.Bag.add(1);
		this.Bag.add(5);
		Iterator<Integer> it = this.Bag.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	@Test
	public void pushSize() {
		this.Bag.add(15);
		this.Bag.add(1);
		this.Bag.add(5);
		assertEquals(3, this.Bag.size());
	}

}
