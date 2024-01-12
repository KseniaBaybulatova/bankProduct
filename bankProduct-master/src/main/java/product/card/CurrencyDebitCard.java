package product.card;

import java.math.BigDecimal;

public class CurrencyDebitCard extends Card {

  public CurrencyDebitCard(String productName, String currency, BigDecimal balance) {
    super(productName, currency, balance);
  }
}
