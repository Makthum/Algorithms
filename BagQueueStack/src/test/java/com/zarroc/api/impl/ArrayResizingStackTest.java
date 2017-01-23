package com.zarroc.api.impl;

import org.junit.Before;

public class ArrayResizingStackTest extends AbstractStackTest {

	@Before
	public void before() {
		this.stack = new ArrayResizingStack<Integer>();
	}

}
