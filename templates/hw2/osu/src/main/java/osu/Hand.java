package osu;

public class Hand extends ArrayList<Card>{

    void discardCard(int handPos, int currentPlayer, int trashFlag){
	//if card is not trashed, added to Played pile 
	if (trashFlag < 1)
	    {
		//add card to played pile
		state.playedCards[state.playedCardCount].state.hand[currentPlayer][handPos]; 
		state.playedCardCount++;
	    }
	
	//set played card to -1
	state.hand[currentPlayer][handPos] = -1;
	
	//remove card from player's hand
	if ( handPos == (state.handCount[currentPlayer] - 1) ) 	//last card in hand array is played
	    {
		//reduce number of cards in hand
		state.handCount[currentPlayer]--;
	    }
	else if ( state.handCount[currentPlayer] == 1 ) //only one card in hand
	    {
		//reduce number of cards in hand
		state.handCount[currentPlayer]--;
	    }
	else 	
	    {
		//replace discarded card with last card in hand
		state.hand[currentPlayer][handPos] = state.hand[currentPlayer][ (state.handCount[currentPlayer] - 1)];
		//set last card to -1
		state.hand[currentPlayer][state.handCount[currentPlayer] - 1] = -1;
		//reduce number of cards in hand
		state.handCount[currentPlayer]--;
	    }
	

    }

}
