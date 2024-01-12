package product.card;

import org.junit.Assert;

import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreditCardTest {

    @Test
    void replenishmentPositiveTest() {
        CreditCard creditCard = new CreditCard("Кредитная карта", "RUB", BigDecimal.valueOf(1000L), BigDecimal.valueOf(20L));
        BigDecimal newBalance = creditCard.replenishment(BigDecimal.ONE);
        Assertions.assertEquals(1001L, newBalance.longValue());
    }

    @Test
    void replenishmentNegativeTest() {
        CreditCard creditCard = new CreditCard("Кредитная карта2", "RUB",
            BigDecimal.valueOf(1000L), BigDecimal.valueOf(20L));
        BigDecimal newBalance = creditCard.replenishment(BigDecimal.ONE);
        Assertions.assertEquals(1000L, newBalance.longValue());
    }

    @Test
    void debitTest() {
        CreditCard creditCard = new CreditCard("Кредитная карта3", "RUB",
            BigDecimal.valueOf(1000L), BigDecimal.valueOf(20L));
        BigDecimal newBalance = creditCard.debit(BigDecimal.ONE);
        Assertions.assertEquals(999L, newBalance.longValue());
    }


    @Test
    void balanceStateTest() {
        CreditCard creditCard = new CreditCard("Кредитная карта4", "RUB",
            BigDecimal.valueOf(100L), BigDecimal.valueOf(20L));
        creditCard.balanceState();
        Assertions.assertEquals(100L, creditCard.getBalance().longValue());
    }

    @Test
    void creditTest() {
        CreditCard creditCard = new CreditCard("Кредитная карта5", "RUB",
            BigDecimal.valueOf(1000L), BigDecimal.valueOf(20L));
        BigDecimal saldo = creditCard.credit();
        Assertions.assertEquals(1000l, saldo.longValue());
    }
}