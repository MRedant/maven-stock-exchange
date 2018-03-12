package be.redproject;

public class StockService {

    public static Stock getStock(String stockId){

        StockRepository populatedStock = StockRepository.getInstance();
        Stock notFilledStockValue = populatedStock.getStockInformation(stockId);
        return populatePriceForStock(stockId, notFilledStockValue);

    }

    private static Stock populatePriceForStock(String stockId, Stock notFilledStockValue) {
        return notFilledStockValue.setPrice(new StockPrice(ExternalStockInformationService.getPriceInEuroForStock(stockId), StockCurrency.EUR));
    }

}
