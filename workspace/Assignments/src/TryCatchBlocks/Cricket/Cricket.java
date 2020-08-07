package TryCatchBlocks.Cricket;

public class Cricket extends Sport {
	boolean isThirdUmpire;
	int noOfPowerPlays;
	String typeOfMatch;

	void checkLBW() {
		System.out.println("LBW result...");
	}

	void dLS() {
		System.out.println("DLS rule...");
	}

	void getCricketDetails(boolean isThirdUmpire, int noOfPowerPlays, String typeOfMatch) {
		System.out.println("Thrid umpire " + isThirdUmpire + " No of power plays " + noOfPowerPlays + " Type of Match "
				+ typeOfMatch);
	}

	public static void main(String[] args) {
		Cricket iPL = new Cricket();
		iPL.getSportDetails(11, 3.15, true);
		iPL.toss();
		iPL.warmUp();
		iPL.result(true);
		iPL.checkLBW();
		iPL.dLS();
		iPL.getCricketDetails(true, 11, "20-20");
	}
}