package test;

public class SingletonClass {

	int num = 10;

//	 

	private static SingletonClass instance;

	public static SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass();
		}

		return instance;
	}

}
