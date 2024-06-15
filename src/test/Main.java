package test;

public class Main {

	
	 public static boolean detectCapitalUse(String word) {
	        boolean flag=true;
	        for (int i = 0; i < word.length(); i++) {
	            if (!(((int) word.charAt(i) >= 65) && ((int) word.charAt(i) <= 90))) {
	                return false;
	            } 
	        }
	        return flag;
	    }
	 
	 
	public static void main(String[] args) {

		boolean b= detectCapitalUse("USA");
		if(b)
		{
			System.out.println("This is capital");
		}
		else {
			System.out.println("This is small");
		}
	}
}
