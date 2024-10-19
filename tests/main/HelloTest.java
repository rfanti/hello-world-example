package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloTest {

	@Test
	void testGetHello() {
		HelloWorld hw = new HelloWorld("José");	
		assertEquals("Hello world, José", hw.getHello());
	}

	@Test
	void testGetHelloWithDifferentName() {
		HelloWorld hw = new HelloWorld("Maria");    
		assertEquals("Hello world, Maria", hw.getHello());
	}

	@Test
	void testGetHelloWithEmptyName() {
		HelloWorld hw = new HelloWorld("");    
		assertEquals("Hello world, ", hw.getHello());
	}

	@Test
	void testGetHelloWithNullName() {
		HelloWorld hw = new HelloWorld(null);    
		assertEquals("Hello world, null", hw.getHello());
	}
}
