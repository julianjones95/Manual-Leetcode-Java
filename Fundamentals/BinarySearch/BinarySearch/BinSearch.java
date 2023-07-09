

public class BinSearch {

	public static void main (String[] args) {

		int[][] input = {
				{-1,0,3,5,9,12},
				{-1,0,3,5,9,12},
		};

		int[] target = {9, 2};

		int[] output = {4, -1};

		for(int i =0; i< input.length; i++){
			
			if(search(input[i], target[i]) == output[i]) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
			}

		}

		return;

	}

	public static int search(int[] nums, int target) {

		int l = 0;
		int r =nums.length;

		while(l != r) {


			int m = l + (r-l)/2;


			if(nums[m] == target) {
				return m;
			}

			if( target < nums[m] ) {
				r = m;
			}
			else{
				l = m +1;
			}

		}

		return -1;
	}

}
