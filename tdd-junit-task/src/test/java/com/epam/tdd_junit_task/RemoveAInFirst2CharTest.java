package com.epam.tdd_junit_task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAInFirst2CharTest {
	
	/*TODO List
	 * 1. 1st char is A             "ABCD" ==> "BCD"
	 * 2. 2nd char is A             "BACD" ==> "BCD"
	 * 3. 1st and 2nd char are A   	"AABC" ==> "BC"
	 * 4. No A in 1st and 2nd char  "BBAA" ==> "BBAA"
	 * 5. N char                    "AABAA" ==> "BBAA"
	 * 6. Empty                     ""      ==> ""
	 * 7. 1 A                       "A"     ==> """
	 * 8. ALL As                    "AAAAA" ==> "AAA"
	 */
	
	RemoveAInFirst2Char removeAIn2Char;
	
	@BeforeEach
	void setUp() {
		removeAIn2Char = new RemoveAInFirst2Char();
	}

	@Test
	void testFirstChar() {
		assertEquals("BCD", removeAIn2Char.remove("ABCD"));
	}
	
	@Test
	void testSecondChar() {
		assertEquals("BCD", removeAIn2Char.remove("BACD"));
	}
	
	@Test
	void testBothChar() {
		assertEquals("BC", removeAIn2Char.remove("AABC"));
	}
	
	@Test
	void testNoChar() {
		assertEquals("BBAA", removeAIn2Char.remove("BBAA"));
	}
	
	@Test
	void testNChar() {
		assertEquals("BAA", removeAIn2Char.remove("AABAA"));
	}
	
	
	@Test
	void testEmpty() {
		assertEquals("", removeAIn2Char.remove(""));
	}
	
	@Test
	void testSingleChar() {
		assertEquals("", removeAIn2Char.remove("A"));
	}
	
	@Test
	void testAllChar() {
		assertEquals("AAA", removeAIn2Char.remove("AAAAA"));
	}

}
