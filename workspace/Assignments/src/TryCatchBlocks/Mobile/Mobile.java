package TryCatchBlocks.Mobile;

public class Mobile {
	boolean isSmartPhone;
	double price;

	void calling(boolean network) {
		if (network == false)
			try {
				throw new Exception("No network");
			} catch (Exception e) {

				System.out.println(e);
			}
		else
			System.out.println("calling....");
	}
}
