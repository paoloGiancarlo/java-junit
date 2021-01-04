package doublylinkedlist_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import datastructuredoublylinkedlist.DoublyLinkedList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * the Objective of this project was test some methods from
 * Doublylinkedlist before been implemented based in the documentation from
 * Oracle website
 */
@DisplayName("Test interface java.util.List implemented in java.util.LinkedList")
class TestDoublyLinkedList {

	private List<String> testList1;// for all cases where apply -- R=String

	@BeforeEach
	void inialSetTest() {
		testList1 = new DoublyLinkedList<>();
	}

	@AfterEach
	void resetSetTest() {
		testList1 = null;
	}

	@DisplayName("Test size() method from java.util.LinkedList")
	@Test
	void testSizeMethod() {
		assertTrue(testList1.isEmpty());
		testList1.add("one");
		testList1.add("two");
		testList1.add("three");
		assertEquals(testList1.size(), 3);
	}

	@DisplayName("Test clear() method from java.util.LinkedList")
	@Test
	public void testClearMethod() {
		assertTrue(testList1.isEmpty());
		testList1.add("one");
		testList1.add("two");
		testList1.add("three");

		assertEquals(testList1.size(), 3);
		testList1.clear();
		assertEquals(testList1.size(), 0);
		assertTrue(testList1.size() == 0);
	}

	@DisplayName("Test contains(o : Object) method from java.util.LinkedList")
	@Test
	void testContainsMethod() {
		assertTrue(testList1.isEmpty());
		testList1.add("april");
		assertFalse(testList1.contains("March"));
		assertTrue(testList1.contains("april"));
	}

	@DisplayName("Test add(e : R) method from java.util.LinkedList")
	@Test
	void testAddMethod() {
		assertTrue(testList1.isEmpty());
		testList1.add("one");
		testList1.add("two");
		testList1.add("three");
		assertEquals(testList1.size(), 3);
		testList1.add("four");
		assertEquals(testList1.size(), 4);
	}

	@DisplayName("Test remove(index : int) method from java.util.LinkedList")
	@Test
	void testRemoveMethod() {
		assertTrue(testList1.isEmpty());
		testList1.add("one");
		testList1.add("two");
		testList1.add("three");
		assertEquals(testList1.size(), 3);
		testList1.remove(1);
		assertEquals(testList1.size(), 2);
		assertThrows(IndexOutOfBoundsException.class, () -> testList1.remove(-1));
		assertThrows(IndexOutOfBoundsException.class, () -> testList1.remove(3));

	}

	@DisplayName("Test add(index : int, element : R) method from java.util.LinkedList")
	@Test
	void testAddIndexMethod() {
		assertTrue(testList1.isEmpty());
		testList1.add("one");
		testList1.add("two");
		testList1.add("three");
		assertEquals(testList1.size(), 3);
		testList1.add(1, "ten");
		assertEquals(testList1.size(), 4);
		assertThrows(IndexOutOfBoundsException.class, () -> testList1.add(-1, "outRangeNegative"));
		assertThrows(IndexOutOfBoundsException.class, () -> testList1.add(5, "outRangePositive"));

	}

	@DisplayName("Test set(index : int, element : R) method from java.util.LinkedList")
	@Test
	void testSetIndexMethod() {
		assertTrue(testList1.isEmpty());
		testList1.add("one");
		testList1.add("two");
		testList1.add("three");
		assertEquals(testList1.size(), 3);
		testList1.set(1, "ten");
		assertEquals(testList1.size(), 3);
		assertThrows(IndexOutOfBoundsException.class, () -> testList1.set(4, "outRangeNegative"));
		assertThrows(IndexOutOfBoundsException.class, () -> testList1.set(-1, "outRangePositive"));



	}
}
