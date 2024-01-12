package product.card;

import product.Product;

import java.math.BigDecimal;

public abstract class Card extends Product {
    public Card(String productName, String currency, BigDecimal balance) {
        super(productName, currency, balance);
    }

    //списание
    public BigDecimal debit(BigDecimal sum) {

        return this.balance.subtract(sum);
    }

}
