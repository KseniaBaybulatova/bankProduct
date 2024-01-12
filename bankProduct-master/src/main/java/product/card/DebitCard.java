package product.card;

import java.math.BigDecimal;

public class DebitCard extends Card {

  public DebitCard(String productName, String currency, BigDecimal balance) {
    super(productName, currency, balance);
  }
}
