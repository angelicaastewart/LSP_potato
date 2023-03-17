package org.howard.edu.lsp.midterm.problem51;

import static org.junit.jupiter.api.Assertions.*;


import org.howard.edu.lsp.midterm.problem51.*;
import org.howard.edu.lsp.midterm.problem51.IntegerRange.EmptyRangeException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.*;

class RangeTest {
	private IntegerRange myRange;
	 /**
	 * @throws java.lang.Exception
	 */

	 @BeforeEach
	 void setUp() throws Exception {
	 myRange = new IntegerRange(1, 200);
	 }
	 /**
	 * @throws java.lang.Exception
	 */
	 @AfterEach
	 void tearDown() throws Exception {
	 myRange = null;
	 }
	 
	 @Test
	 @DisplayName("Test case for contains")
	 void testContains() {

		 assertTrue(myRange.contains(20));
		 assertFalse(myRange.contains(500));
	 
	 
	 }
	 
	 @Test
	 @DisplayName("Test case for overlaps")
	 void testOverlaps() throws EmptyRangeException {
		 IntegerRange testRangea = new IntegerRange(3, 200);
		 IntegerRange testRangeb = new IntegerRange(201, 300);
		 
		 assertTrue(myRange.overlaps(testRangea));
		 assertFalse(myRange.overlaps(testRangeb));
	 
	 
	 }
	 
	 @Test
	 @DisplayName("Test case for size")
	 void testSize() {

		 assertTrue(myRange.size() == 200 - 1 + 1);
		 assertFalse(myRange.size() == 200 - 1 + 5);
	 
	 
	 }
}
