package product.deposit;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DepositImplTest {

  @Test
  void closeTest() {
    DepositImpl deposit1 = new DepositImpl("Вклад", "RUB", BigDecimal.valueOf(1000L));
    deposit1.close();
    Assert.assertEquals(
        String.format("Баланс рввен = %s", deposit1.getBalance()),
        null, deposit1.getBalance());
    Assert.assertEquals(
        String.format("Название вклада = %s", deposit1.getProductName()),
        null, deposit1.getProductName());
    Assert.assertEquals(
        String.format("Валюта = %s", deposit1.getCurrency()),
        null, deposit1.getCurrency());
  }

  @Test
    void replenishmentPositiveTest() {
    DepositImpl deposit1 = new DepositImpl("Вклад1", "RUB", BigDecimal.valueOf(1000L));
    deposit1.replenishment(BigDecimal.ONE);
      Assert.assertEquals(1000L, deposit1.getBalance().longValue());
  }

  @Test
  void replenishmentNegativeTest() {
    DepositImpl deposit1 = new DepositImpl("Вклад2", "RUB", BigDecimal.valueOf(1000L));
    deposit1.replenishment(BigDecimal.ONE);
    Assert.assertEquals(1000L, deposit1.getBalance().longValue());
  }

  @Test
  void balanceStateTest() {
    DepositImpl deposit1 = new DepositImpl("Вклад3", "RUB", BigDecimal.valueOf(1000L));
    deposit1.getBalance();
    Assert.assertEquals(1000L, deposit1.getBalance().longValue());

  }

  @Test
  void getProductNameTest() {
    DepositImpl deposit1 = new DepositImpl("Вклад4", "RUB", BigDecimal.valueOf(1000L));
    Assert.assertEquals("Вклад4", deposit1.getProductName());
  }

  @Test
  void getCurrencyTest() {
    DepositImpl deposit1 = new DepositImpl("Вклад5", "RUB", BigDecimal.valueOf(1000L));
    Assert.assertEquals("RUB", deposit1.getCurrency());
  }

  @Test
  void getBalanceTest() {
    DepositImpl deposit1 = new DepositImpl("Вклад6", "RUB", BigDecimal.valueOf(1000L));
    Assert.assertEquals(BigDecimal.valueOf(1000L), deposit1.getBalance());
  }

}