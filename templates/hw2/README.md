Assignment 2

Warm up


Blackjack story

The developer left a note that there was a serious bug that was
affecting a previous version of certain card games. During the
execution of a game, it appeared as if cards within the deck switched
positions. and that they suspected the error was somewhere in either
the Card or CardCollection classes.

Your task is to a) find the issue and b) create a suite of units test
to find existing issues and prevent future ones.

## Writing a test sutie

Create two new files in your submissions/hw2 directory:

submissions/hw2src/test/java/edu/osu/cs362/CardCollectionTest.java 
submissions/hw2src/test/java/edu/osu/cs362/CardTest.java 

To write new test suites, you'll need to mimic the WarmupTest.java
class. In particular: 

 - Your class must extend TestCase
 - Your class must provide method public static Test suite() 
 - Each test case method must start with test...

It is good practice to use a new method for each piece of
functionality you might test.  Similar test cases (e.g., testing a
class constructor with differnet parameters) can be grouped in the
same method

- Write a suite of JUnit tests to test the Card class
- Write a suite of JUnit tests for each method of the Hand class **excluding the `permute` function**. 

## The bug

*Written problem A:*

If you were able to find the issue described above, answer the following

  - What is the bug? Concisely describe it and provide a test case that reproduces it. Include a JUnit case in your writeup that replicates the error.  Be clear as to what the expected and actual outputs look like 
  - Would this error surface when the class was used for the following:
  -- ...a deck where cards are always drawn from the top?
  -- ...a hand where the player is required to keep their cards in order?
  -- ...a deck that is shuffled by removing cards from a random place in the deck and adding them back via method `add`?

If you were unable, for partial credit, describe your approach to developing your test suite

