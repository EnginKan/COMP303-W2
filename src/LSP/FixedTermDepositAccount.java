package LSP;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account {

  /*However, the bank doesn’t want to allow withdrawals for the fixed-term deposit accounts.
    This means that the new FixedTermDepositAccount class
    can’t meaningfully provide the withdraw method that Account defines
   */
  @Override
  protected void deposit(BigDecimal amount) {
    // Deposit into this account
  }

  @Override
  protected void withdraw(BigDecimal amount) {
    throw new UnsupportedOperationException("Withdrawals are not supported by FixedTermDepositAccount!!");
  }
  // Overridden methods...
}
