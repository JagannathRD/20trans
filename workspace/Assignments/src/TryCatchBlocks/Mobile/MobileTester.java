package TryCatchBlocks.Mobile;

public class MobileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MMS");
		Android jb = new Android();
		jb.calling(false);
		jb.usePlayStore();
		Ios apple = new Ios();
		apple.calling(true);
		apple.useAppStore();
		System.out.println("MME");
	}

}
