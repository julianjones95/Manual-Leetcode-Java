import java.util.*;

public class KLargest {


	public static void main(String[] args) {

		int[][] input = {
			{3,2,1,5,6,4},
			{3,2,3,1,2,4,5,5,6}
		};
		
		int[] kVals = {2,4};

		int[] output = {5,4};

		for(int i=0; i<input.length; i++) {
			if(getK(input[i], kVals[i]) == output[i]) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
				System.out.println(getK(input[i], kVals[i])); 
			}
		}
		return;
	}

	public static int getK(int[] numbers, int k) {

		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
	
		for(int val : numbers) {
			maxHeap.add(val);
		}

		for(int i=0; i<k-1; i++) {
			maxHeap.remove();
		}



		return maxHeap.peek();
	}
}
