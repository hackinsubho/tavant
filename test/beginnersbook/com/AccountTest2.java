package beginnersbook.com;

import org.junit.Assert;
import org.junit.Test;



//import method.StudentData;

public class AccountTest2 {

	@Test
	public void testWithdraw() {
		double TotalMoney;
		Account mySavingsAccount = new SavingsAccount();

	}

	@Test
	public void testDeposit() {
		Account mySavingsAccount = new SavingsAccount();
		boolean successful = mySavingsAccount.deposit(200.00);
		Assert.assertTrue(successful);
	}

	@Test
	public void testDepositNegativeAmount() {
		Account mySavingsAccount = new SavingsAccount();
		double amountDeposited = -200.00;
		boolean successful = mySavingsAccount.deposit(amountDeposited);
		Assert.assertFalse("You have attempted to deposit " + amountDeposited + " which is a negative amount.", successful);
	}

	@Test
	public void testDepositLargeAmount() {
		Account mySavingsAccount = new SavingsAccount();
		boolean successful = mySavingsAccount.deposit(50000.00);
		Assert.assertFalse(successful);
	}

}
