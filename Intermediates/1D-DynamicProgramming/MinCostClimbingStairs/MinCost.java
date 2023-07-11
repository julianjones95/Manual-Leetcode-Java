

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
				System.out.println(getMinCost(input[i]));
			}
		}
		return;
	}

	public static int getMinCost(int[] cost) {


		int[] dp = new int[cost.length+1];

		dp[0] = 0;
		dp[1] = cost[0];

		for(int i=1; i<dp.length-1; i++) {
			dp[i+1] = Math.min(dp[i] , dp[i-1]) + cost[i];
		}

		return Math.min(dp[cost.length], dp[cost.length-1]);
	}
}
