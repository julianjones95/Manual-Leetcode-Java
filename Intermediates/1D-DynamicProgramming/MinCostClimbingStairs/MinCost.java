

public class MinCost {

	public static void main(String[] args) {
		
		int[][] input = {
			{10,15,20},
			{1,100,1,1,1,100,1,1,100,1}
		};

		int[] output = {15,6};
		
		for(int i=0; i<input.length; i++) {
			if(getMinCost(input[i]) == output[i]) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
			}
		}
		return;
	}

	public static int getMinCost(int[] cost) {


		int[] dp = new int[cost.length];

		dp[0] = 0;
		dp[1] = nums[0];

		for(int i=0; i<cost.length; i++) {
			cost[i] = Math.min(cost[i-1] , cost[i-2]) + cost[i];
		}


	}
}
