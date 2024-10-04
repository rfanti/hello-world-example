package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloTest {

	@Test
	void testGetHello() {
		HelloWorld hw = new HelloWorld("Guilherme");	
		assertEquals("Hello world, Guilherme", hw.getHello());
	}
}
