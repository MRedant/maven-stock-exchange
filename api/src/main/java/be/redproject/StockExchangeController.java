package be.redproject;

public class StockExchangeController {

    StockDto getStock(String stockId){
        return StockDtoMapper.mapToDto(StockService.getStock(stockId));
    }
}
