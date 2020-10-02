
public class BankHacking {

	public static void main(String[] args) {
		Bank bank = new Bank("SBIn888");
		try{
		bank.deposit(-10000);
		}catch(RuntimeException e){
			e.printStackTrace();
		}
	}

}
