package CricketException;

public class Cricket extends Sport {
	boolean isThirdUmpire;
	int noOfPowerPlays;
	String typeOfMatch;
	boolean itRains = false;

	void checkLBW() {
		System.out.println("LBW result...");
	}

	void dLS(boolean raining) throws CricketException {
		itRains = raining;
		if (itRains == true)
			throw new CricketException("It's raining");
		else
			System.out.println("Match to be completed...");
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
		iPL.result();
		iPL.checkLBW();
		try {
			iPL.dLS(true);
		} catch (CricketException e) {

			e.printStackTrace();
		}
		iPL.getCricketDetails(true, 11, "20-20");
	}
}