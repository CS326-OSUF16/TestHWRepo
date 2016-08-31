package edu.osu.cs362;

import java.util.*;


public class Hand{
    /*
      Hand represents an ordered collection of cards, such as 
      a player's hand or a discard pile
    */
 	  
    protected List<Card> handCards = new ArrayList<Card>(); 

    public Hand(Card ... init){
	for(Card c: init){
	    handCards.add(c);
	}  
    } 
    
    public List<Card> getHandCards(){
	return handCards;
    }

    public void add(Card c){
	handCards.add(c);
    }

    public void discardCard(int handPos, GameState gs, boolean trashFlag){
	/*
	  Removes a card from the deck at position `handPos` and
	  either discards the card into the common discard pile or
	  removes it from the game completely based on `trashFlag`
	*/
	  
	if (!trashFlag) {
	    gs.playedCards.add(handCards.get(handPos)); 
	}
	handCards.remove(handCards.get(handPos));
    }

    public static void main(String[] argv){
	// Example main method for Maven
	Hand hb = new Hand(Card.adventurer,Card.curse,Card.copper);

	GameState gs = new GameState();

	System.out.print("Before:");
	for(Card c: hb.getHandCards()){
	    System.out.print(c.name()+ " ");
	} 
	System.out.println();
	hb.discardCard(1, gs, true);

	System.out.print("After:");
	for(Card c: hb.getHandCards()){
	    System.out.print(c.name()+" ");
	} 
	System.out.println();


    }
}

/*
Original C method

int discardCard(int handPos, int currentPlayer, struct gameState *state, int trashFlag)
{
	
  //if card is not trashed, added to Played pile 
  if (trashFlag < 1)
    {
      //add card to played pile
      state->playedCards[state->playedCardCount] = state->hand[currentPlayer][handPos]; 
      state->playedCardCount++;
    }
	
  //set played card to -1
  state->hand[currentPlayer][handPos] = -1;
	
  //remove card from player's hand
  if ( handPos == (state->handCount[currentPlayer] - 1) ) 	//last card in hand array is played
    {
      //reduce number of cards in hand
      state->handCount[currentPlayer]--;
    }
  else if ( state->handCount[currentPlayer] == 1 ) //only one card in hand
    {
      //reduce number of cards in hand
      state->handCount[currentPlayer]--;
    }
  else 	
    {
      //replace discarded card with last card in hand
      state->hand[currentPlayer][handPos] = state->hand[currentPlayer][ (state->handCount[currentPlayer] - 1)];
      //set last card to -1
      state->hand[currentPlayer][state->handCount[currentPlayer] - 1] = -1;
      //reduce number of cards in hand
      state->handCount[currentPlayer]--;
    }
	
  return 0;
}

 */
