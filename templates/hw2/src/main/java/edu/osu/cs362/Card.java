package edu.osu.cs362;

public enum Card {

	CURSE(0), ESTATE(1), DUCHY(2), PROVINCE(3),

	COPPER(4), SILVER(5), GOLD(6),

	ADVENTURER(7),
	/* IF no/only 1 treasure found, stop when full deck seen */
	COUNCIL_ROOM(8), FEAST(9), /* choice1 is supply # of card gained) */
	GARDENS(10), MINE(11), /*
							 * choice1 is hand# of money to trash, choice2 is
							 * supply# of money to put in hand
							 */
	REMODEL(12), /* choice1 is hand# of card to remodel, choice2 is supply# */
	SMITHY(13), VILLAGE(14),

	BARON(15), /* choice1: boolean for discard of estate */
	/* Discard is always of first (lowest index) estate */
	GREAT_HALL(16), MINION(17), /* choice1: 1 = +2 coin, 2 = redraw */
	STEWARD(18), /*
					 * choice1: 1 = +2 card, 2 = +2 coin, 3 = trash 2 (choice2,3)
					 */
	TRIBUTE(19),

	AMBASSADOR(20), /* choice1 = hand#, choice2 = number to return to supply */
	CUTPURSE(21), EMBARGO(22), /* choice1 = supply# */
	OUTPOST(23), SALVAGER(24), /* choice1 = hand# to trash */
	SEA_HAG(25), TREASURE_MAP(26);

	public final int id;

	Card(int v) {
		this.id = v;
	}

	public int getId() {
		return id;
	}

}
