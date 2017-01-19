import java.util.List;
import java.util.ArrayList;

public class Deck {

	private List<Card> cards;

	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		for(int i = 0; i < ranks.length; i++){
			for(int j = 0; j < suits.length; j++){
				cards.add(new Card(ranks[i], suits[j], values[i]));
			}
		}
	size = cards.size();
	}

	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}

	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}

	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
	}

	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}

	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
