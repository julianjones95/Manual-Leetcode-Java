import java.util.*;

public class TwoSum {

	public static void main(String[] args) {

		int[][] input = {
			{2,7,11,15},
			{3,2,4},
			{3,3}
		};

		int[] target = {9,6,6};

		int[][] output = {

			{0,1},
			{1,2},
			{0,1}
		};

		for(int i=0; i<input.length; i++) {

			if(Arrays.equals(checkSum(input[i], target[i]),output[i])) {
				System.out.println("Passed");	
			}
			else {
				System.out.println("Failed");
			}
		}

		return;
	}

	public static int[] checkSum(int[] nums, int target){

		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}

		return new int[] {0,0};
	}

}
