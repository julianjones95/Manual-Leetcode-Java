import java.util.*;

public class StoneWeight {

	public static void main(String[] args) {

		int[][] input = {
			{2,7,4,1,8,1},
			{1},
			{1,1,1,1}
		};

		int[] output = {1,1,0};

		for(int i=0; i< input.length; i++) {
			if(getLastStone(input[i]) == output[i]) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
				System.out.println(getLastStone(input[i]));
			}
			
		}

		return;
	}


	public static int getLastStone(int[] stones) {

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		for(int i=0; i< stones.length; i++) {
			maxHeap.add(stones[i]);
		}

		while (maxHeap.size() > 1) {
			
			System.out.println(maxHeap);
			int largest = maxHeap.peek();
			maxHeap.remove();
			int secondLargest = maxHeap.peek();
			maxHeap.remove();

			if(largest == secondLargest) {
				continue;
			}

			maxHeap.add(largest-secondLargest);


		}
		
		if(maxHeap.size() == 0) {
			return 0;
		}

		return maxHeap.peek();
	}

}
