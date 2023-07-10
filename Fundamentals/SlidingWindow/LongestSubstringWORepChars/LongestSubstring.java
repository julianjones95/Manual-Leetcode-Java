import java.util.*;

public class LongestSubstring {

	public static void main (String[] args) {

		String[] input = {"abcabcbb", "bbbbb", "pwwkew"};

		int[] output = {3,1,3};

		for(int i =0; i< input.length; i++) {

			if(checkLength(input[i]) == output[i]) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
				System.out.println(checkLength(input[i]));
			}
		}

		return;
	}

	public static int checkLength(String s) {

		int l = 0;
		int r = 1;
		int max = 0;

		Set<Character> window = new HashSet(); 

		while (r != s.length()) {
			if(window.contains(s.charAt(r))) {
				window.remove(s.charAt(l));
				l++;
			}
			else {
				window.add(s.charAt(r));
				r++;
				if(window.size()>max) {
					max = window.size();
				}
			}
		
		}

		return max;
	}

}
