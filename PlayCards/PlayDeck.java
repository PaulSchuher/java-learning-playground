import java.util.*;

public class PlayDeck {
  private PlayCard[] deckCards = new PlayCard[52];

  public PlayDeck() {
  	int i = 0;
    for (Suit suit : Suit.values()) {
    	for (Rank rank : Rank.values()) {
    		deckCards[i++] = new PlayCard(rank, suit);
    	}
    }
  }

  public PlayCard[] getCards() {
    return this.deckCards;
  }

  public PlayCard getCard(int index) {
    return this.deckCards[index];
  }
}
