import java.util.*;

public class ValidAnagram {

	public static void main(String[] args) {
		
		String[][] tests = 
		{
			{"anagram","nagaram", "P"},
			{"aangram","nagaram", "P"},
			{"anagram","ganaram", "P"},
			{"anagram","naramxx", "F"},


		};

		for(int i =0; i<tests.length; i++) {
			if(checkAnagram(tests[i][0], tests[i][1]) &&  tests[i][2] == "P" || !checkAnagram(tests[i][0], tests[i][1]) && (tests[i][2] == "F")  ) {
				System.out.println("Passed");
			}
			else{
				System.out.println("Failed");
			}
		}

		return;

	}

	public static boolean checkAnagram(String s, String t){

		HashMap<Character, Integer> anagram = new HashMap();
	
		for(int i=0; i<s.length(); i++) {
			anagram.put(s.charAt(i), anagram.getOrDefault(s.charAt(i),0) + 1);
		}


		for(int i=0; i<t.length(); i++) {
			anagram.put(t.charAt(i), anagram.getOrDefault(t.charAt(i),0) - 1);
		}

	
		for(int val : anagram.values()) {
			if(val !=0) {
				return false;
			}
		}


		return true;
	}	

}
