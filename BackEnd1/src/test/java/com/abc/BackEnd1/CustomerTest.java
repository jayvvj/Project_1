package com.abc.BackEnd1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerTest {

	@Test
	public void test() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.abc.BackEnd1");
		ctx.refresh();
		ctx.close();
		assertTrue(true);
	}
}