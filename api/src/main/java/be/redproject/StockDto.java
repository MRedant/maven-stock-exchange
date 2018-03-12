package be.redproject;

import java.math.BigDecimal;

public class StockDto {

    private String id;
    private String name;
    private StockPrice price;

    public StockDto(String id, String name, StockPrice price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price.getPrice();
    }

    public String getCurrency(){
        return price.getCurrency().name();
    }
}
