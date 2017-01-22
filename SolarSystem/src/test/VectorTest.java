package test;
import entity.HelpClass;
import entity.Vector;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VectorTest {

	Vector thisVector;
	Vector v;
	
	@Before
	public void setUp() throws Exception {
		thisVector = new Vector(1.5,2.0,3.7);
		v = new Vector(3.7,2.0,1.5);
	}

	@After
	public void tearDown() throws Exception {
		thisVector = null;
		v = null;
	}

	@Test
	public void testGetElement() {
		double[] expected = {1.5, 2.0, 3.7};
		double[] actual = {thisVector.getElement(0),thisVector.getElement(1),thisVector.getElement(2)};
		
		for(int i = 0; i < thisVector.length();i++)
		{
			assertEquals("The expected value: " + expected[i] + " was not equal the actual value " + actual[i], expected[i], actual[i], 1e-12);
		}
	}

	@Test
	public void testGetEuclideanNorm() {
		double expected = Math.sqrt(Math.pow(1.5,2) + Math.pow(2.0, 2) + Math.pow(3.7, 2));
		double actual = thisVector.getEuclideanNorm();
		assertEquals("The expected value: " + expected + " was not equal the actual value " + actual, expected, actual, 1e-12);
	}

	@Test
	public void testLength() {
		int expected = 3;
		int actual = thisVector.length();
		assertEquals("The expected value: " + expected + " was not equal the actual value " + actual, expected, actual, 1e-12);
		
	}

	/**
	 * This test does not check for overflow.
	 */
	@Test
	public void testAdd() {
		Vector expected = new Vector(5.2,4.0,5.2);
		thisVector.add(v);
		Vector actual = thisVector;
		assertTrue(expected.equals(actual));
	}

	/**
	 * This test does not check for underflow.
	 */
	@Test
	public void testSubtract() {
		Vector expected = new Vector(-2.2, 0.0, 2.2);
		thisVector.subtract(v);
		Vector actual = thisVector;
		assertTrue(expected.equals(actual));
	}

	@Test
	public void testEqualsVector() {
		assertTrue(thisVector.equals(thisVector));
	}

	
}
