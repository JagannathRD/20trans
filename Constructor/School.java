
public class School {
	String name;
	String principal;
	String area;
	int NoOfStudents;

	School() {

	}

	School(String inname) {
		name = inname;
	}

	School(String princi, int students) {
		principal = princi;
		NoOfStudents = students;
	}

	School(String inname, String princi, int students, String ar) {
		name = inname;
		principal = princi;
		area = ar;
		NoOfStudents = students;
	}

	void hasHoliday(boolean holiday) {
		System.out.println("is school holiday " + holiday);
	}

	void isRunning() {
		System.out.println("is running");
	}

	public static void main(String[] args) {
		System.out.println("MMS");
		School jss = new School();
		System.out.println("Name " + jss.name + " Principal " + jss.principal + " Area is " + jss.area + " Students "
				+ jss.NoOfStudents);

		School darbar = new School("srs");
		System.out.println("Name " + darbar.name + " Principal " + darbar.principal + " Area is " + darbar.area
				+ " Students " + darbar.NoOfStudents);

		School srs = new School("LHK", 60);
		System.out.println("Name " + srs.name + " Principal " + srs.principal + " Area is " + srs.area + " Students "
				+ srs.NoOfStudents);

		School pdj = new School("pdj", "hp", 70, "Ashram");
		System.out.println("Name " + pdj.name + " Principal " + pdj.principal + " Area is " + pdj.area + " Students "
				+ pdj.NoOfStudents);
		pdj.hasHoliday(true);
		pdj.isRunning();

		System.out.println("MME");
	}
}
