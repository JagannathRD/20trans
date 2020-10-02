
public class WrongPasswordException extends Exception {
	public WrongPasswordException(String s) {
		super("Enter correct password");
	}
}
