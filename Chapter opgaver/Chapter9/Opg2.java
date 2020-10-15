package Chapter9;

public class Opg2 {
    public static void main(String[] args) {

        Stock Stock1 = new Stock("OCRL","Oracle Corporation");
        Stock1.previousClosingPrice = 34.5;
        Stock1.currentPrice = 34.35;

        System.out.println("The price change percentage for " + Stock1.symbol + " aka. " + Stock1.name + " is " + Stock1.getChangePercent() + ".");
    }
}

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;


    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;

    }
    double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice)* 100;
    }
}

