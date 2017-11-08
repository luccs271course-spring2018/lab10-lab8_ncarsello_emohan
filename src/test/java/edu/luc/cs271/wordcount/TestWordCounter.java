package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // Done complete this test class

  // Done declare a reference to the SUT (system under test), i.e., Wordwordy
  WordCounter wordy;

  @Before
  public void setUp() {
    // Done create the SUT instance
    Map<String, Integer> map = new HashMap<String, Integer>();
    wordy = new WordCounter(map);
  }

  @After
  public void tearDown() {
    // Done set the SUT instance to null
    wordy = null;
  }

  @Test
  public void testGetCountEmpty() {

    // Done verify that the SUT initially returns an empty map
    assertTrue(wordy.getCounts().isEmpty());
  }

  @Test
  public void testGetCountNonEmpty() {

    // Done run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator

    wordy.countWords(Arrays.asList("HELLO", "OK", "JUST", "WORK").iterator());

    assertEquals(wordy.getCount("HELLO"), 1);
    assertEquals(wordy.getCount("OK"), 1);
  }
}
