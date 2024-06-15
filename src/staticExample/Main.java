package staticExample;

import test.Message;

public class Main {

	public static void main(String[] args) {
		Message message=new Message();
		message.messages();
		Human human=new Human(21, "rahul", 2323, false);
		human.printName();
		System.out.println("population "+human.population);
		Human human2=new Human(21, "kashyap", 5655, false);
		System.out.println("population "+human.population);

	}
}
