package com.zarroc.api.impl;

import org.junit.Before;

public class LinkedStackTest extends AbstractStackTest {

	@Before
	public void before() {
		this.stack = new LinkedStack<Integer>();
	}

}
