package be.redproject;

public class MyCLI {
    public static void main(String[] args) {
        if (args.length == 1) {
            StockExchangeController controller = new StockExchangeController();
            StockDto stockDto = controller.getStock(args[0]);
            printStockDto(stockDto);
        } else {
            System.out.println("Please provide an ID");
        }
    }

    private static void printStockDto(StockDto stockDto) {
        System.out.println("Stock : "+ stockDto.getId());
        System.out.println(String.format("\tName: %s", stockDto.getName()));
        System.out.println(String.format("\tPrice: %s %s", stockDto.getPrice().intValue(), stockDto.getCurrency()));
    }
}
