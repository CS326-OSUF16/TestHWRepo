package edu.osu.cs362;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
/**
 * Unit test for simple App.
 */
public class HandTest 
{

    /**
     * Rigourous Test :-)
     */
    @TestCase
    public void testSimple()
    {
	Hand hb = new Hand();
	hb.add
	hb.discardCard(1, gs, true);
	assertEquals(hb.getHandCards().size(),2);
    }
}
