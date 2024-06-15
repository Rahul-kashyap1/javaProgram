package test;

class Human {

	String name;
	int age;
	int salary;
	String address;

	public Human(String name, int age, int salary, String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name " + name + " age " + age + " salary " + salary + " address " + address;
	}

	public int[] sortArray(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				int temp;
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	public void factorial(int n) {
		int fact = 1;
		for (int i = n; i > 1; i--) {
			fact = fact * i;
		}
		System.out.println("fact " + fact);
	}

	public boolean checkPrimeNumber(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return true;
			}
		}
		return false;
	}

	public void printFibonacciSeries(int n) {
		int n1 = 0;
		int n2 = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(n1 + " ");
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}

}

public class Demo {
	public static void main(String[] args) {

		Human rahul = new Human("Rahul", 23, 10000, "Ujina");
		int[] b = rahul.sortArray(new int[] { 90, 37, 7, 28, 4, 57 });

		// sort the array
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

		// find the factorial
		rahul.factorial(5);

		// check the number is prime or not
		int n = 6;
		if (rahul.checkPrimeNumber(n)) {
			System.out.println(n + " is not prime number ");
		} else {
			System.out.println(n + " is prime number ");
		}
		rahul.printFibonacciSeries(10);

	}
}
//Robinson  145 // 1+24+120 = 145 
// Armtrong
//Perfect  // 