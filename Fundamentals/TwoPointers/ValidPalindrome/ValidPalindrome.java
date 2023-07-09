public class ValidPalindrome {

	public static void main(String[] args) {


		String[] input = {"A man, a plan, a canal: Panama", "race a car", " "};

		boolean[] output = {true, false, true};

		for(int i=0; i<input.length; i++) {

			if(checkValid(input[i]) ==output[i]) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
			}
		}

		return;
	}
	
	public static boolean checkValid( String s){



		// Strip everything out except alphanumerics
		
		String q = s.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase().replaceAll(" ", "");
		for(int i=0; i<q.length()/2; i++) {

			if(q.charAt(i) != q.charAt(q.length() - i -1) ) {
				return false;
			}
		}

		return true;


	}
}
