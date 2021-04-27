
public class Course {
	int id;
	String name;
	String details;
	String instructor;
	double price;

	public Course() {
		System.out.println("New course added");
	}

	public Course(int id, String name, String details, String instructor, double price) {

		this.id = id;
		this.name = name;
		this.details = details;
		this.instructor = instructor;
		this.price = price;
		System.out.println("New course added");
	}

}
