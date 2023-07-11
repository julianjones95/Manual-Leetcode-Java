

public class KLargest {

	public static void main(String[] args) {

		int[][] input ={
			{2,2,2,1,6,4},
			{3,3,3,1,2,4,5,5,6}
		};

		int[] kVal = {1,4};

		int[] output = {{2}, {3,5} };

		for(int i=0; i<input.length; i++) {
			if(findK(input[i], kVal[i]) == output[i]) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
			}
		}

		return;	
	}

	public static int[] findK(int[] nums, int k) {

		// Each value in nums has a "position" 
		// We can assign an array with each position 
		// We can then build a histogram using a hashmap of the various frequencies
		
		HashMap <Integer, Integer> countVals = new HashMap<>();
		int[][] frequency = new int[nums.length][nums.length];
	
		for (int vals : nums) {
			countVals.put(vals, countVals.getOrDefault(vals,0) + 1);
		}


		// Unfinished needs a list to append elements into this.
		for(Map.Entry{Integer, Integer} obj : countVals) {
			int key = obj.getKey();
			int val = obj.getValue();
			frequency[key][value] = v;
		}

		return 0;
	} 

}
