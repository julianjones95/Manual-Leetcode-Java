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

		for(int i = 0; i<input.length; i++) {

			if(Arrays.equals(getSum(input[i], target[i]), output[i])) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
				System.out.println(Arrays.toString(getSum(input[i], target[i])));
			}
		}
	}


	public static int[] getSum (int[] nums, int target) {

		HashMap<Integer, List<Integer>> mappedIndices = new HashMap<>();

		// We need this to map back the indices to their values
		for(int i=0; i<nums.length; i++) {

			if(!mappedIndices.containsKey(nums[i])){
				mappedIndices.put(nums[i], new ArrayList<>());
			}
			mappedIndices.get(nums[i]).add(i);
		}
		Arrays.sort(nums);

		int l = 0;
		int r = nums.length-1;

		System.out.println(Arrays.toString(nums));
		while(l != r) {
		
			if(nums[l] + nums[r] == target) {
				if(nums[l] == nums[r]) {
					List<Integer> left = mappedIndices.get(nums[l]);
                			List<Integer> right = mappedIndices.get(nums[r]);
					
					return new int[] {left.get(0), right.get(1)};
				}

				List<Integer> left = mappedIndices.get(nums[l]);
				List<Integer> right = mappedIndices.get(nums[r]);
				return new int[] {left.get(0), right.get(0)};
				
			}

			if(nums[l] + nums[r] < target) {
				l++;
			}
			else {
				r--;
			}

		}

		return new int[] {-1,-1};

	}

}
