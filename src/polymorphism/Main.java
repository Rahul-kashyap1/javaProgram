package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static List<String> commonChars(String[] words) {
		ArrayList<String> list = new ArrayList<>();

        String[] firstWordArray = words[0].split("");
        System.out.println("first word array "+Arrays.toString(firstWordArray)+" length "+ firstWordArray.length);

        for (int i = 0; i < firstWordArray.length; i++) {
        	System.out.println("words[i+1].contains(firstWordArray[i]  "+ words[i+1]+" "+firstWordArray[i]);
        	for(int j=0;j<words[j].length();j++)
        	{
        		if(firstWordArray[i].charAt(i)==words[j].charAt(j))
        		{
        			list.add(firstWordArray[i]);
        		}
        	}
           
        }
        return list;
	}

	public static void main(String[] args) {

		String[] str= new String[]{"bella","label","roller"};
		System.out.println(commonChars(str));
	}
}
