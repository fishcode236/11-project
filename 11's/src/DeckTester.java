
public class DeckTester {

	public static void main(String[] args) {
		int[] points = { 1, 2, 3, 4 };
		String[] ranks = { "Squid", "Doug", "MermaidMan", "BarnBoy" };
		String[] suits = { "Sea creature", "Unwanted" };
		Deck d = new Deck(ranks, suits, points);
		System.out.println(d);
	}
}