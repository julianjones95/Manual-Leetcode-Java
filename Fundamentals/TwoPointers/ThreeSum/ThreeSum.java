import java.util.*;

public class ThreeSum {


	public static void main(String[] args) {


		int[][] input = {
			{-1,0,1,2,-1,-4},
			{0,1,1},
			{0,0,0},
		}; 

		int[][][] output = {
			{{-1,-1,2},{-1,0,1}},
			{},
			{{0,0,0}},
		};


		for(int i = 0; i<input.length; i++) {
			if(compareLists(checkSum(input[i]), output[i])) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
				System.out.println(checkSum(input[i]).toString());
				System.out.println(Arrays.deepToString(output[i]));
			}
		}

		return;
	}

	public static boolean compareLists(List<List<Integer>> list2, int[][] list1) {
	    for (int i = 0; i < list1.length; i++) {
		for (int j = 0; j < list1[i].length; j++) {
		    if (list1[i][j] != list2.get(i).get(j)) {
			return false;
		    }
		}
	    }

	    // All elements are equal
	    return true;
    	}


    public static List<List<Integer>> checkSum(int[] nums) {
        Arrays.sort(nums); // Sort the input array
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates of the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    output.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Skip duplicates of the second element
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates of the third element
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return output;
    }

}
