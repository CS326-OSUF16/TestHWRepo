package edu.osu.cs362;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class HandTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public HandTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(HandTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		Hand hb = new Hand(Card.ADVENTURER, Card.CURSE, Card.COPPER);
		GameState gs = new GameState();
		hb.discardCard(1, gs, true);
		assertEquals(hb.getHandCards().size(), 2);
	}

}
