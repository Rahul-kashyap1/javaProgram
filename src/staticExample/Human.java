package staticExample;

public class Human {

	int age;
	String name;
	int salary;
	boolean married;
	static long population;

	public Human(int age, String name, int salary, boolean married) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.married = married;
		this.population++;
	}

	public void printName() {
		System.out.println("My name is " + this.name);
	}

}
