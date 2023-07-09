import java.util.*;

public class TwoSum {


	public static void main(String[] args) {

		int[][] input = {
				{2,7,11,15},
				{2,3,4},
				{-1,0},
		};

		int[] target = {9,6,-1};

		int[][] output = {{1,2},{1,3},{1,2}};
		
		for(int i=0; i< input.length; i++) {
	
			int[] retVal = checkSum(input[i], target[i]);
			if( Arrays.equals(retVal, output[i])) {
				System.out.println("Passed");
				System.out.println(checkSum(input[i], target[i]));	
			}
			else {
				System.out.println("Failed");
				System.out.println(Arrays.toString(retVal));	
			}
			

		}
		
		return;
	}

	public static int[] checkSum(int[] nums, int target) {


		int l = 0;
		int r = nums.length-1;
		
		while (l != r) {

			if(nums[l] + nums[r] == target) {
				return new int[] {l+1,r+1};
			}
			else if(nums[l] + nums[r] > target) {
				r = r-1;
			}
			else {
				l = l+1;
			}

			
		}
	

		return new int[] {l,r};
	}
}
