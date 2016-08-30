package osu;

public enum Card
{

    curse(0,true),
    estate(1,true),
    duchy(2,true),
    province(3,true),

    copper(4,true),
    silver(5,true),
    gold(6,true),

    adventurer(7),
    /* If no/only 1 treasure found, stop when full deck seen */
    council_room(8),
    feast(9), /* choice1 is supply # of card gained) */
    gardens(10),
    mine(11), /* choice1 is hand# of money to trash, choice2 is supply# of
		 money to put in hand */
    remodel(12), /* choice1 is hand# of card to remodel, choice2 is supply# */
    smithy(13),
    village(14),

    baron(15), /* choice1: boolean for discard of estate */
    /* Discard is always of first (lowest index) estate */
    great_hall(16),
    minion(17), /* choice1:  1 = +2 coin, 2 = redraw */
    steward(18), /* choice1: 1 = +2 card, 2 = +2 coin, 3 = trash 2 (choice2,3) */
    tribute(19),

    ambassador(20), /* choice1 = hand#, choice2 = number to return to supply */
    cutpurse(21),
    embargo(22), /* choice1 = supply# */
    outpost(23),
    salvager(24), /* choice1 = hand# to trash */
    sea_hag(25),
    treasure_map(26);


    public final int v;
    Card(int v){
	return new Card(v,isRegular);
    }
    Card(int v,boolean isRegular ){
	this.id = v;
	this.isRegular = true;
    }
    public int getId(){
	return v;
    }

}
