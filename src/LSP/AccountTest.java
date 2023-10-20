package LSP;
import javax.swing.plaf.ColorUIResource;
import java.math.BigDecimal;
public class AccountTest {

  public static void main(String[] args) {


    WithdrawableAccount myFixedTermDepositAccount = new CurrentAccount();

    myFixedTermDepositAccount.deposit(new BigDecimal(100.0));

    BankingAppWithdrawalService withdrawalService =
            new BankingAppWithdrawalService(myFixedTermDepositAccount);

    withdrawalService.withdraw(new BigDecimal(100.00));
  }
}
