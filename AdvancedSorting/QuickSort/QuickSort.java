import java.util.*;

public class QuickSort {

	public static void main(String[] args) {

		int[][] input = {{1,4,3,5,2,6}};

		int[][] output = {{1,2,3,4,5,6}};


		if(Arrays.equals(sort(input[0]),output[0])){
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}

		return;
	}

	public static int[] sort(int[] nums, int start, int end) {

		int[] output = new int[nums.length];

		int pivot = nums.length-1;

		int l = 0;
		int r = 0;

		while (r != pivot) {
			if(nums[r] > nums[pivot]) {
				r++;
			}
			else {
				l++;
				int temp = nums[r];
				output[r] = nums[l];
				output[l] = temp;
			}
		}

		sort(nums, l, r);
		sort(nums, r, pivot);

		return new output;

	}

	public static int[] recurse (int[] nums, int start, int end) {

	}

}
