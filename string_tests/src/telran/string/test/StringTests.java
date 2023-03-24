package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void testCharAtMethod() {
		assertEquals("W", charAtMethod("World"));
	}

	private Object charAtMethod(String string) {
		
		return null;
	}

	@Test
	void testCompareToMethod() {
		assertEquals(0, compareToMethod("World","World"));
	}

	private Integer compareToMethod(String string, String string2) {
		
		return null;
	}

	@Test
	void testCompareToIgnoreCaseMethod() {
		assertEquals(0, compareToIgnoreCaseMethod("WORLD","world"));
	}

	private Integer compareToIgnoreCaseMethod(String string, String string2) {
		
		return null;
	}

	@Test
	void testConcatMethod() {
		assertEquals("Svetlana Doskochinskaia", concatMethod("Svetlana","Doskochinskaia"));
	}

	private Integer concatMethod(String string, String string2) {
		
		return null;
	}

	@Test
	void testStartWithMethod() {
		assertEquals(true, startWithMethod("World","wor"));
	}

	private Object startWithMethod(String string, String string2) {
		
		return null;
	}

	@Test
	void testEndWithMethod() {
		assertEquals(false, endWithMethod("World","wor"));
	}

	private Object endWithMethod(String string, String string2) {
		
		return null;
	}

	@Test
	void testContainsMethod() {
		assertEquals(true, containsMethod("World","wor"));
	}

	private Object containsMethod(String string, String string2) {
		
		return null;
	}

	@Test
	void testIndexOfMethod() {
		assertEquals(11, indexOfMethod("this crazy world","world"));
	}

	private Object indexOfMethod(String string, String string2) {
	
		return null;
	}

	@Test
	void lastIndexOfMethod() {
		assertEquals(11, lastIndexOfMethod("this crazy world","world"));
	}

	private Integer lastIndexOfMethod(String string, String string2) {
		
		return null;
	}

}
