package be.redproject;

import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.Map;

public class StockRepository {

    //Lazy Singleton class = in first run there is no instance yet, you have to call the getInstance-method first
    private Map<String, Stock> fakeDatabase;

    private static StockRepository instance = null;

    private StockRepository() {
        this.fakeDatabase = Maps.newHashMap();
        fakeDatabase.put("AA", new Stock("AA", "Ambro AN"));
        fakeDatabase.put("IB", new Stock("IB", "AB Inbev"));
        fakeDatabase.put("ING", new Stock("ING", "Ing Bank"));
    }


    public static StockRepository getInstance() {
        if (instance == null) {
            instance = new StockRepository();
        }
        return instance;
    }

    private Map<String, Stock> getFakeDatabase(){
        return Collections.unmodifiableMap(getInstance().fakeDatabase);
    }

    Stock getStockInformation(String stockId) throws IllegalArgumentException {

        if (getFakeDatabase().get(stockId) != null) {
            return getFakeDatabase().get(stockId);
        } else {
            throw new IllegalArgumentException("No stock found for ID " + stockId);
        }
    }
}
