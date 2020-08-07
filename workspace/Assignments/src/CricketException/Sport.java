package CricketException;

public class Sport {
	int noOfPlayers;
	double duration;
	boolean isWinner;

	void toss() {
		System.out.println("Toss winner to play first");
	}

	void warmUp() {
		System.out.println("Warming up");
	}

	void trainig() {
		System.out.println("training");
	}

	void result() {
		System.out.println("Result of sport");
	}

	void getSportDetails(int noOfPlayers, double duration, boolean isWinner) {
		System.out.println(
				"No of players is " + noOfPlayers + " Sport Duration " + duration + " Winner of Sport " + isWinner);
	}
}
