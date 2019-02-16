package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import desarrollo.Cesar;

public class TestCesar {

	@Test
	public void testReturnNumberAsString() {

		int valor1 = 1;
		int valor2 = 2;
		String text = "abc";

		String result1 = Cesar.encriptaCesar(valor1, text);
		String result2 = Cesar.encriptaCesar(valor2, text);

		assertEquals("bcd", result1, "It didn't encrypt properly");
		assertEquals("cde", result2, "It didn't encrypt properly");

	}

}
