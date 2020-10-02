
public class Book {
	String name = "jj";
	String ch = "J";

	int noOfPages;
	double price;
	String s = name + ch;

	Book() {
		System.out.println("DF constructor");
		System.out.println(s);
		System.out.println(s.hashCode() + " " + name.hashCode() + " " + ch.hashCode());
	}

	public static void main(String[] args) {
		Book book = new Book();

	}

}
