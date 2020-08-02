
public class MobileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MMS");
		Android jb = new Android();
		jb.calling();
		jb.usePlayStore();
		Ios apple = new Ios();
		apple.calling();
		apple.useAppStore();
		System.out.println("MME");
	}

}
