package be.redproject;

import java.math.BigDecimal;

import static be.redproject.StockCurrency.EUR;
import static org.junit.Assert.*;

public class StockRepositoryTest {

    @org.junit.Test
    public void getStockInformation() {
        // GIVEN
        StockRepository stockService = StockRepository.getInstance();

        // WHEN
        Stock actualStock = stockService.getStockInformation("ING");
        actualStock.setPrice(new StockPrice(new BigDecimal(50), EUR));

        // THEN
        assertEquals(actualStock.getId(), ("ING"));
        assertEquals(actualStock.getName(), ("Ing Bank"));
        assertNotNull(actualStock.getPrice());
        assertEquals(actualStock.getPrice().getCurrency(), (EUR));
        assertTrue(actualStock.getPrice().getPrice().intValue() > 10 && actualStock.getPrice().getPrice().intValue() < 100);
    }
}