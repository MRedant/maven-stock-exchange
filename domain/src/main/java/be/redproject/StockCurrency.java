package be.redproject;

public enum StockCurrency {
    EUR("Euro","€")
    ,USD("Dollar","$")
    ,GBP("Pound","£");

    private String currencyName;
    private String curruncySymbol;

    StockCurrency(String currencyName, String curruncySymbol) {
        this.currencyName = currencyName;
        this.curruncySymbol = curruncySymbol;
    }
}
