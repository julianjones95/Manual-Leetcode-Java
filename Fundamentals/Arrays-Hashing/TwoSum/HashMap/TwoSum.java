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
				if(Arrays.equals(getSum(input[i],target[i]), output[i])) {
					System.out.println("Passed");
				}
				else {
					System.out.println("Failed");
					System.out.println(Arrays.toString(getSum(input[i],target[i])));
				}
			}

			return;
		}

		public static int[] getSum(int[] nums, int target) {
		
			HashMap<Integer, Integer> checkMap = new HashMap<>();

			// x + y = target -> target - x = y
			for (int i=0; i<nums.length; i++) {
				int currentValue = target - nums[i];

				if(checkMap.containsKey(currentValue)) {
					return new int[] {checkMap.get(currentValue), i};
				}

				checkMap.put(nums[i],i);

			}

			return new int[] {0,0};	
		}
}
