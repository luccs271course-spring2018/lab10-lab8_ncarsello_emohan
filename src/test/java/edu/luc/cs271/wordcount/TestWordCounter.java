package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // done complete this test class

  // done declare a reference to the SUT (system under test), i.e., WordCounter

  
  Map<String, Integer> zMap = new HashMap<>();
  WordCounter count = new WordCounter(zMap); 

  @Before
  public void setUp() {
    // done create the SUT instance
    this.count = count;
  }

  @After
  public void tearDown() {
    // done  set the SUT instance to null
    count = null;
    
  }

  @Test
  public void testGetCountEmpty() {

    // done verify that the SUT initially returns an empty map
    assertTrue(zMap.isEmpty)
  }

  @Test
  public void testGetCountNonEmpty() {
    int correctCounts = WordCounter.getCount("the");
    assertEquals(correctCounts, 15);
    int correctCountsTwo = WordCounter.getCount("and");
    asssertEquals(correctCountsTwo, 12);
    int correctCountsThree = WordCounter.getCount("qwerty");
    asssertEquals(correctCountsThree, 15);
    int correctCountsFour = WordCounter.getCount("poop");
    asssertEquals(correctCountsFour, 0);



  }
}
