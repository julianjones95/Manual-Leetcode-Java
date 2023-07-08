import java.util.*;

public class Duplicate {

	public static void main(String[] args) {


		int[][] input = 
		{
			{1,2,3,1,5},
			{1,1,3,4,5},
			{1,2,3,4,5},
		};

		boolean[] output = {true,true,false};

		for( int i=0; i<input.length; i++  ){
	
			if(checkDuplicates(input[i]) && output[i] || !checkDuplicates(input[i]) && !output[i] ){
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
			}
		}

		return;
	}

	public static boolean checkDuplicates(int[] nums) {


		HashMap<Integer, Integer> checkMap = new HashMap<Integer,Integer>();

		for(int i : nums) {

			if(checkMap.getOrDefault(i,0) == 0) {
				checkMap.put(i,1);
			}
			else {
				return true;
			}

		}


		return false;

	}


}
