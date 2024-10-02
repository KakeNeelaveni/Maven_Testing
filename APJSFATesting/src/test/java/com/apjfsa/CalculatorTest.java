package com.apjfsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator calci = new Calculator();

	@Test
	void addTest() {
		int answer = calci.add(25, 35);
		assertEquals(60, answer);

	}

	@Test
	void subractTest() {
		assertEquals(40, calci.subract(100, 60));

	}

	@Test
	void productTest() {
		assertEquals(30, calci.product(15, 2));

	}
	@Test
	void divisionTest() {
		int answer=calci.division(20, 4);
		assertEquals(5,answer);
		
	}
}
