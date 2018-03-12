package be.redproject;

public class StockDtoMapper {

    public static StockDto mapToDto(Stock stock){
        return new StockDto(stock.getId(),stock.getName(),stock.getPrice());
    }

}
