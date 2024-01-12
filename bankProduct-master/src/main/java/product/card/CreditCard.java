package product.card;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public BigDecimal interestRate;

    CreditCard(String productName, String currency, BigDecimal balance, BigDecimal interestRate) {
        super(productName, currency, balance);
        this.interestRate = interestRate;
    }

    public BigDecimal credit() {

        return balance;
    }



}
