package product.deposit;

import java.math.BigDecimal;
import product.Product;

public abstract class Deposit extends Product {


    public Deposit(String productName, String currency, BigDecimal balance) {
        super(productName, currency, balance);
    }

    public void close() {
        this.balance = null;
        this.productName = null;
        this.currency = null;
    }
}
