package ISP;

import java.util.List;

public class LoanPayment implements Payment {

  @Override
  public void initiatePayments() {
    throw new UnsupportedOperationException("This is not a bank payment");
  }

  @Override
  public Object status() {
    // ...
  }

  @Override
  public List<Object> getPayments() {
    // ...
  }

  @Override
  public void intiateLoanSettlement() {
    // ...
  }

  @Override
  public void initiateRePayment() {
    // ...
  }
}
