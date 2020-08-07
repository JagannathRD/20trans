package TryCatchBlocks.Cricket;

public class Sport {
	int noOfPlayers;
	double duration;
	boolean isWinner;

	void toss() {

		System.out.println("B to play first");
	}

	void warmUp() {
		System.out.println("Warming up");
	}

	void trainig() {
		System.out.println("training");
	}

	void result(boolean draws) {
		if (draws == true)
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("1 point to each team " + e);
			}
		else
			System.out.println("Result of sport");
	}

	void getSportDetails(int noOfPlayers, double duration, boolean isWinner) {
		System.out.println(
				"No of players is " + noOfPlayers + " Sport Duration " + duration + " Winner of Sport " + isWinner);
	}
}
