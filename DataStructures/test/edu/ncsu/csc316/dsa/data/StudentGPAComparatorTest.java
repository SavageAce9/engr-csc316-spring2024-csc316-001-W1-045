package edu.ncsu.csc316.dsa.data;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests the StudentGPA Comparator class.
 */
public class StudentGPAComparatorTest {

	private Student sOne;
	private Student sTwo;

	private StudentGPAComparator comparator;

	@Before
	/**
	 * Tests the set up for comparator.
	 */
	public void setUp() {
		sOne = new Student("OneFirst", "OneLast", 1, 1, 1.0, "oneUnityID");
		sTwo = new Student("TwoFirst", "TwoLast", 2, 2, 2.0, "twoUnityID");

		comparator = new StudentGPAComparator();
	}

	@Test
	/**
	 * Tests the actual comparator.
	 */
	public void testCompare() {
		assertTrue(comparator.compare(sTwo, sOne) < 0);
		assertFalse(comparator.compare(sOne, sTwo) < 0);
	}

}
