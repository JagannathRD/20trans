
public class DataTypeSum {

	double sum(int a, double b) {
		double add;
		add = a + b;
		return add;
	}

	double sum(long a, double b, int c) {
		double add;
		add = a + b + c;
		return add;
	}

	public static void main(String[] args) {
		System.out.println("MMS");
		DataTypeSum dts = new DataTypeSum();

		System.out.println(dts.sum(10, 2.5));
		System.out.println(dts.sum(10l, 2.5, 10));
		System.out.println("MME");
	}
}
