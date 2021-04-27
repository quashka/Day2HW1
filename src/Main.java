
public class Main {

	public static void main(String[] args) {

		User user1 = new User("engin", "1234");
		User user2 = new User("berkay", "1903");

		User[] users = { user1, user2 };
		for (User user : users) {
			System.out.println(user.mail + " " + user.password);
		}

		Course course1 = new Course();
		course1.id = 1;
		course1.name = "C# + Angular";
		course1.details = "2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.";
		course1.instructor = "Engin Demiroð";
		course1.price = 0;

		Course course2 = new Course(2, "Java + React",
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.",
				"Engin Demiroð", 0);
		Course course3 = new Course(3, "Programlamaya Giriþ",
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.",
				"Engin Demiroð", 0);

		Course[] courses = { course1, course2, course3 };
		for (Course course : courses) {
			System.out.println(course.id + "--" + course.name + "--" + course.details + "--" + course.instructor + "--"
					+ course.price);
		}

		UserManager userManager = new UserManager();
		userManager.enrollCourse(course2);
		userManager.leaveCourse(course2);

	}

}
