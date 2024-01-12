package product;

/*
Вам необходимо выстроить и написать архитектуру для банковских продуктов. Банковскими продуктами являются – кредитная карта, дебетовая карта, валютная дебетовая карта и вклад.
- Карты и вклад имеют параметры: валюта, баланс и название
- Карты содержат методы: пополнение, списание, запрос баланса
- Кредитная карта имеет дополнительный метод запрос задолженности и дополнительный параметр процентная ставка
- Вклад содержит методы: пополнение, запрос баланса, закрытие

-пополнение
-списание
-запрос баланса
-запрос задолженнсти
-закрытие

 */

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public abstract class Product {
    protected String productName;
    protected String currency;
    protected BigDecimal balance;


    public Product(String productName, String currency, BigDecimal balance) {

        this.productName = productName;
        this.currency = currency;
        this.balance = balance;
    }

    //пополнение
    public BigDecimal replenishment(BigDecimal sum) {
        return balance.add(sum);
    }


    //запрос баланса
    public BigDecimal balanceState() {
        return balance;
    }

}
