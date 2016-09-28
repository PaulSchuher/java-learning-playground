public class TestPlayDeck {

  public static void main(String[] args) {
    PlayDeck deck = new PlayDeck();
    for (int i = 0; i < 52; i++) {
        System.out.println(deck.getCard(i));
    }
  }

}
