package info.bitrich.xchange.coinmate.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.knowm.xchange.coinmate.dto.marketdata.CoinmateTransactionsEntry;

import java.math.BigDecimal;

public class CoinmateWebSocketTrade {
    private final long timestamp;
    private final BigDecimal price;
    private final BigDecimal amount;

    public CoinmateWebSocketTrade(@JsonProperty("date") long timestamp, @JsonProperty("price") BigDecimal price, @JsonProperty("amount") BigDecimal amount) {
        this.timestamp = timestamp;
        this.price = price;
        this.amount = amount;
    }

    public CoinmateTransactionsEntry toTransactionEntry(String currencyPair) {
        return new CoinmateTransactionsEntry(timestamp, null, price, amount, currencyPair);
    }
}
