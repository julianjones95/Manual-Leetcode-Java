import java.util.*;


public class KLargest {

		public static void main(String[] args) {

			int[][] input = {
				{4, 5, 8, 2},
			};

			int[] kVal = {3};

			int[][] additions = {
				{3,5,10,9,4}
			};

			int[][] output = {
				{0, 4, 5, 5, 8, 8}
			};

			for(int i=0; i< input.length; i++) {
				if(Arrays.equals(getKLargest(kVal[i], input[i], additions[i]), output[i])) {
					System.out.println("Passed");
				}
				else {
					System.out.println("Failed");
				}

			}

			return;
		}

		public static int[] getKLargest(int k, int[] initialVals, int[] additionVals) {

			PriorityQueue<Integer> minHeap = new PriorityQueue<>();
			int[] output = new int[additionVals.length + 1];

			for(int i=0; i<initialVals.length; i++) {
				minHeap.add(initialVals[i]);
			}

			while (minHeap.size() >k ) {
				minHeap.remove();
			}

			output[0] = 0;
			for(int i=0; i<additionVals.length; i++) {
				minHeap.add(additionVals[i]);
				minHeap.remove();
				output[i+1] = minHeap.peek();
			}
			System.out.println(Arrays.toString(output));	
			return output;
		}
}
