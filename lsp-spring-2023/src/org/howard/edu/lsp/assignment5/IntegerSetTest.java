package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment5.IntegerSet.IntegerSetException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.*;
/**
 * @author brtah
 *
 */
class IntegerSetTest {
private IntegerSet mySet;
 /**
 * @throws java.lang.Exception
 */

 @BeforeEach
 void setUp() throws Exception {
 mySet = new IntegerSet();
 }
 /**
 * @throws java.lang.Exception
 */
 @AfterEach
 void tearDown() throws Exception {
 mySet = null;
 }
 
 @Test
 @DisplayName("Test case for add")
 void testAdd() {
 mySet.add(3);
 assertEquals(1, mySet.length());
 assertTrue(mySet.contains(3));
 }
 @Test
 @DisplayName("Test case for remove")
 void testRemove() throws IntegerSetException{
 for(int i = 0; i < 7; i++) {
 mySet.add(i);
 }
 mySet.remove(3);
 assertFalse(mySet.contains(3));
 }

 @Test
 @DisplayName("Test case for length")
 void testLength() {
 for (int i = 0; i < 5; i++) {
 mySet.add(i);
 }
 assertTrue(mySet.length() == 5);
 }
 @Test
 @DisplayName("Test case for clear")
 void testClear() {
 mySet.add(12); mySet.clear();
 assertEquals(mySet.length(), 0);
 }

 @Test
 @DisplayName("Test case for equals")
 void testEquals() {
 IntegerSet testSet = new IntegerSet();
 IntegerSet testSet1 = new IntegerSet();
 IntegerSet testSet2 = new IntegerSet();

 for(int i = 0; i < 5; i++) {
 mySet.add(i); testSet.add(i); testSet1.add(i);
 }
 //Testing two objects are equal
 assertEquals(true, mySet.equals(testSet));
 //Testing two objects are not equal
 assertEquals(false, testSet1.equals(testSet2));}

 @Test
 @DisplayName("Test case for contains")
 void contains() {
 mySet.add(259);
 assertTrue(mySet.contains(259));
 assertFalse(mySet.contains(2310));
 } 

 @Test
 @DisplayName("Test case for largest")
 void testLargest() throws IntegerSetException {
 mySet.add(5);
 mySet.add(10);
 mySet.add(15);
 mySet.add(20);
 mySet.add(25);
 assertTrue(mySet.largest() == 25);
 }
 
 @Test
 @DisplayName("Test case for largest exception thrown")
 void testLargestException() {
 assertThrows(IntegerSetException.class, () -> mySet.largest());
 }
@Test
@DisplayName("Test case for smallest")
void testSmallest() throws IntegerSetException {
mySet.add(5);
mySet.add(10);
mySet.add(15);
mySet.add(20);
assertTrue(mySet.smallest() == 5);
}
@Test
@DisplayName("Test case for smallest exception")
void testSmallestException() {
assertThrows(IntegerSetException.class, () -> mySet.smallest());
}

@Test
@DisplayName("Test case for union method")
void testUnion() {
IntegerSet testSet = new IntegerSet();
IntegerSet nextSet = new IntegerSet();
IntegerSet constSet = new IntegerSet();
testSet.add(1);
testSet.add(3);
testSet.add(4);
nextSet.add(3);
nextSet.add(4);


 constSet.add(1);
 constSet.add(3);
 constSet.add(4);


 testSet.union(nextSet);
 assertEquals(testSet.toString(), constSet.toString());
 }

 @Test
 @DisplayName("Test case for intersect")
 void testInteserct() {
 IntegerSet testSet = new IntegerSet();
 IntegerSet constSet = new IntegerSet();

 mySet.add(0);
 mySet.add(1);
 mySet.add(3);
 testSet.add(3);
 testSet.add(4);
 testSet.add(5);

 
constSet.add(3);
 
 //testing intersection
 mySet.intersect(testSet);
 assertEquals(mySet.toString(), constSet.toString());
}

@Test
@DisplayName("Test case for diff")
 void testDiff() {
 IntegerSet testSet = new IntegerSet();

 IntegerSet constSet = new IntegerSet();
 
 
 mySet.add(0); mySet.add(1); mySet.add(2);
 testSet.add(0); testSet.add(1);
 
 constSet.add(2);


 mySet.diff(testSet);
 assertEquals(mySet.toString(), constSet.toString());}

@Test
@DisplayName("Test case for isEmpty")
 void testEmpty() {
 assertTrue(mySet.isEmpty());
 }
 
 @Test
 @DisplayName("Test case for toString")
 void testString(){
 mySet.add(1);
 mySet.add(2);
 mySet.add(3);
 mySet.add(4);
 mySet.add(5);
 assertEquals(mySet.toString(), "1, 2, 3, 4, 5, "); }
}
