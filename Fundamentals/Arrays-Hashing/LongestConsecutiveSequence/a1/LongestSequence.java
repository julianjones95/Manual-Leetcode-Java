import java.util.*;

public class LongestSequence {

	public static void main(String[] args) {

		int[][] input = {

			{100,4,200,1,3,2},
			{0,3,7,2,5,8,4,6,0,1}

		};

		int[] output = {4,9};

		for(int i =0; i<input.length; i++) {
			
			if(longestSequence(input[i]) == output[i]) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");

				System.out.println(longestSequence(input[i]));
			}
		} 

		return;
	}


	public static int longestSequence(int[] nums) {

		Arrays.sort(nums);

		int length = 1;
		int max = 1;		
		for(int i=1; i<nums.length; i++ ) {


			if(nums[i] - nums[i-1] == 1) {
				length++;
				if(length>max) {
					max = length;
				}
			}
			else {
				length = 1;
			}
	
		}
		

		return max;
	}
}
