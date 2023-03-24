package telran.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringMethods {


	@Test
	void testCharAtMethod() {
	 assertEquals("W",  "World".charAt(0));
	}


	@Test
	void testCompareToMethod() {
		assertEquals(0, "World".compareTo("World"));
	}

	

	@Test
	void testCompareToIgnoreCaseMethod() {
		assertEquals(0, "WORLD".compareToIgnoreCase("world"));
	}

	

	@Test
	void testConcatMethod() {
		assertEquals("Svetlana Doskochinskaia","Svetlana".concat("Doskochinskaia"));
	}

	
	@Test
	void testStartWithMethod() {
		assertEquals(true, "World".startsWith("wor"));
	}

	

	@Test
	void testEndWithMethod() {
		assertEquals(false, "World".endsWith("wor"));
	}

	

	@Test
	void testContainsMethod() {
		assertEquals(true, "World".contains("wor"));
	}

	

	@Test
	void testIndexOfMethod() {
		assertEquals(11, "this crazy world".indexOf("world"));
	}

	

	@Test
	void lastIndexOfMethod() {
		assertEquals(11, "this crazy world".lastIndexOf("world"));
	}

	
}
