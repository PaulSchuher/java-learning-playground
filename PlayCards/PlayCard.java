public class PlayCard {
  private Rank rank;
  private Suit suit;

  public PlayCard(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }

  public String toString() {
    return rank + " of " + suit;
  } 
}
