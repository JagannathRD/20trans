
public class Bank {
	private String accNum;
	private int balance = 10000;

	public Bank(String inputAcctNo) {
		accNum = inputAcctNo;
	}

	public void displayBalance(String acctno) {
		System.out.println("the balance for acct " + acctno + " is :" + balance);
	}

	public void deposit(int amount) throws RuntimeException {
		if (amount > 0)
			balance += amount;
		else
			throw new RuntimeException("plesae enter correct deposit amount");
	}

	void witdrwal() {

	}
}
