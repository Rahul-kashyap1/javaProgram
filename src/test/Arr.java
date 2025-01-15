package test;

public class Arr {

	public static void getSumOfSquareOfNnumber(int n) {

		int sum = 0;
		for (int i = 1; i <= 3; i++) {
			sum = sum + i * i;
		}
		System.out.println(sum);
	}

	public static void sumOfDigitOfNumber(int n) {
		int sum = 0;
		while (n != 0) {
			int num = n % 10;
			sum = sum + num;
			n = n / 10;
		}
		System.out.println(sum);
	}

	public static void countVowel(String word) {

		char[] vowel = new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		int vowelCount = 0;

		char[] n = word.toCharArray();

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < vowel.length; j++) {
				if (n[i] == vowel[j]) {
					vowelCount++;
				}
			}
		}
		System.out.println(vowelCount);
	}
	// 2
	// int reverse=0
	// 2422
	// rem=2422%10=2
//	int sum=reverse*10+rem;
	// 2*10+2

	public static void checkPalindrome(String word) {

		String[] n = word.split("");
		int start = 0;
		int end = n.length - 1;
		for (int i = 0; i < n.length / 2; i++) {
			System.out.println("inside for loop");
			if (start == end) { 
				System.out.println("palindrome");
				break;
			}
		}

	}

	public static void main(String[] args) {

//		getSumOfSquareOfNnumber(3);
//		sumOfDigitOfNumber(687);
//		countVowel("rAhul");
		checkPalindrome("asdsa");
	}
}
