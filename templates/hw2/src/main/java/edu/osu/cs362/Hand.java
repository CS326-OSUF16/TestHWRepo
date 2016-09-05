package edu.osu.cs362;

import java.util.*;


public class CardCollection{
    /*
      CardCollection represents an ordered collection of cards, such as 
      a player's hand or a discard pile
    */
 	  
    protected List<Card> cards = new ArrayList<Card>(); 

    public CardCollection(Card ... init){
	for(Card c: init){
	    cards.add(c);
	}  
    } 
    
    public List<Card> getCards(){
	return cards;
    }

    public void add(Card c){
	cards.add(c);
    }

    public Card discardCard(int handPos){
	/*
	  Removes a card from the deck at position `handPos` and
	  either discards the card into the common discard pile 
	*/
	return cards.remove(cards.get(handPos));
    }

    public void permute(int[] pv){
	/* pv is an array of integers that specify a permutation (a
	   rearrangement or shuffling) of the cards in this deck
	   
	   If the ith element of pv is k, then the ith element of
	   cards should be placed in the kth position.
	*/
	   
	if(pv.length != this.cards.size())
	    throw new IllegalArgumentException();

	int nexti =  0;
	for(int i = 0;i<pv.length;i++){
	    int newi = pv[nexti];
	    newi = pv[nexti];
	    Collections.swap(this.cards,nexti,newi);
	    nexti = newi;
	} 
{




