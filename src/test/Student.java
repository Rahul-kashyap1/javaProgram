package test;

 class Student {

	String name;
	int roll;
	float marks;

	public Student(String name, int roll, float marks) {
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}

	public static void main(String[] args) {

		Student rahul = new Student("rahul", 2, 34.6f);

		System.out.println(rahul.name);

	}

}
