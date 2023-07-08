import java.util.*;

public class GroupAns {

	public static void main(String[] args) {

		String[][] input = {{"eat","tea","tan","ate","nat","bat"}};

		String[][] output = {{"bat"},{"nat","tan"},{"ate","eat","tea"}};
		

		for(int i=0; i<input.length; i++) {
			if(groupAnagrams(input[i]).equals(Arrays.asList(output[i]))){
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
			}
		}

		return;
	}


	static List<List<String>> listAnagrams = new ArrayList<>();

	public static List<List<String>> groupAnagrams(String[] strs) {

		for(int i =0; i<strs.length; i++) {
			for(int j =i+1; j<strs.length; j++) {
	
				if(checkAnagram(strs[i],strs[j])) {
					listAnagrams.add(Arrays.asList(strs[i], strs[j]));
				}

			}
		}

		System.out.println(listAnagrams);
		return listAnagrams;

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
