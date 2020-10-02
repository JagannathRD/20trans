
public class Fb {
	private String useName;
	private String passWord = "abcd";

	public void chat(String inpassword) throws WrongPasswordException {
		if (this.passWord == inpassword)
			System.out.println("Chats");
		else
			throw new WrongPasswordException("Heloo");
	}
}
