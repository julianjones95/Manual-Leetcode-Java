import java.util.*;

public class ValidAnagram {

	public static void main(String[] args) {


		String[][] input  = {
			{"anagram","nagaram"},
			{"rat", "car"},
			{"black","clabk"}
		};

		boolean[] output = {true, false, true};

		for(int i=0; i<input.length; i++) {
			if(checkString(input[i][0], input[i][1]) == output[i]) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
				System.out.println(checkString(input[i][0], input[i][0]));
			}
		}

		return;

	}


	public static boolean checkString(String s1, String s2) {

		HashMap<Character, Integer> checkMap = new HashMap<>();

		for(int i =0; i<s1.length(); i++) {
			char val = s1.charAt(i);
			checkMap.put(val, checkMap.getOrDefault(val, 0) +1);
		}


		for(int i =0; i<s2.length(); i++) {
			char val = s2.charAt(i);
			checkMap.put(val, checkMap.getOrDefault(val, 0) -1);
		}

		for(int val: checkMap.values()) {

			if(val != 0) {
				return false;
			}
		}

		return true;
	}
}
