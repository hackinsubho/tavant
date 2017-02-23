package beginnersbook.com;

public interface Account {
	public default boolean withdraw(double Money) throws Exception {
		return false;
	}

	public default boolean deposit(double Money) {
		return false;
	}

}

class SavingAccount implements Account {
	public static double TotalMoney = 1000;
	public boolean withdraw(double Money) throws Exception {
		try {
			if (TotalMoney >= 1000)
				System.out.println("Balance successfully withdraw");
			return true;
			} 
		catch (Exception e) {
			System.out.println("Unsuccessful");
			return false;
		}

	}
	public boolean deposit(double Money) {
		if(Money>49999){
			System.out.println("NEED PAN CARD DETAILS");
			return false;
			}
			else
			{
				System.out.println("Money sucessfully deposited"+Money);
				return true;
			}
	}
}

