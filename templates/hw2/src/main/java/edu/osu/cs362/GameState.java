package osu;
import java.util.*;

public class GameState {
    public static final int MAX_HAND = 500;
    public static final int MAX_DECK =  500;
    public static final int MAX_PLAYERS = 4;    

    public int numPlayers; //number of players
    public Map<Card,Integer> supplyCount  = new HashMap<Card,Integer>();
    public Map<Card,Integer> embargoTokens  = new HashMap<Card,Integer>();
    public int outpostPlayed;
    public int outpostTurn;
    public int whoseTurn;
    public int phase;
    public int numActions; /* Starts at 1 each turn */
    public int coins; /* Use as you see fit! */
    public int numBuys; /* Starts at 1 each turn */
    public Hand hand[]  = new Hand[MAX_PLAYERS];
    public Hand deck[]  = new Hand[MAX_PLAYERS];
    public Hand discard[]  = new Hand[MAX_PLAYERS];
    public Hand playedCards;

    public Random rand;

    
};

