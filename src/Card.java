public class Card
{
    private String rank;
    private String suit;
    private int pointValue;

    public Card(String rank, String suit, int pointValue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }
    public boolean equals(Card firstCard,Card otherCard)
    {
        if( firstCard == otherCard)
        {
            return true;
        }
        return false;
    }
    public String toString()
    {
        return "" + rank + "of" + suit + pointValue;
    }
}
