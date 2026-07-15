package tm06_03Project;

public class Card implements Comparable<Card> {

    private String symbol;
    private int number;

    public Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card c) {
        return this.symbol.compareTo(c.symbol);
    }
}