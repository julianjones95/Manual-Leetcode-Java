import java.util.*;

public class TwoSum {

	public static void main(String[] args) {


		int[][] inputs = {
		    {2, 7, 11, 15},
		    {1, 7, 11, 15, 9},
		    {0, 9, 11, 15},
		    {2, 3, 4, 5},
		    {2, 3, 11, 7}
		};

		int[][] outputs = {
		    {0, 1},
		    {0, 0},
		    {0, 1},
		    {2, 3},
		    {0, 3}
		};


		for (int i=0; i<inputs.length; i++) {
			
			if(Arrays.equals(GetTarget(inputs[i],9), outputs[i])) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
			}
		}
	}

	public static int[] GetTarget(int[] nums, int target){
		
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
