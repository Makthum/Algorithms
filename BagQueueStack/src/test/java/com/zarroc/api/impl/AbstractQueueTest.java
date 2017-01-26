package com.zarroc.api.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.zarroc.api.Queue;

public abstract class AbstractQueueTest {

	protected Queue<Integer> queue = null;

	@Rule
	public ExpectedException expected = ExpectedException.none();

	@Test
	public void ObjectCreation() {
		assertNotNull(this.queue);
	}

	@Test
	public void enqueue() {
		assertNotNull(this.queue);
		assertEquals(0, this.queue.size());
		this.queue.enqueue(15);
		assertEquals(1, this.queue.size());

	}

	@Test
	public void dequeue() {
		assertNotNull(this.queue);
		assertEquals(0, this.queue.size());
		this.queue.enqueue(15);
		assertEquals(15, this.queue.dequeue().intValue());
	}

	@Test
	public void isEmpty() {
		assertNotNull(this.queue);
		assertTrue(this.queue.isEmpty());
	}

	@Test
	public void size() {
		assertNotNull(this.queue);
		assertEquals(0, this.queue.size());
	}

	@Test
	public void dequeueOnEmpty() {
		assertNotNull(this.queue);
		assertEquals(0, this.queue.size());
		expected.expect(RuntimeException.class);
		this.queue.dequeue();
	}

	@Test
	public void iterator() {
		this.queue.enqueue(15);
		this.queue.enqueue(1);
		this.queue.enqueue(5);
		Iterator<Integer> it = this.queue.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	@Test
	public void enqueueSize() {
		this.queue.enqueue(15);
		this.queue.enqueue(1);
		this.queue.enqueue(5);
		assertEquals(3, this.queue.size());
	}

	@Test
	public void enqueuedequeueSize() {
		this.queue.enqueue(15);
		this.queue.enqueue(1);
		this.queue.enqueue(5);
		this.queue.dequeue();
		assertEquals(2, this.queue.size());
	}

	@Test
	public void dequeuetoZero() {
		this.queue.enqueue(15);
		this.queue.enqueue(1);
		this.queue.enqueue(5);
		this.queue.dequeue();
		this.queue.dequeue();
		this.queue.dequeue();
		assertEquals(0, this.queue.size());
	}

}
