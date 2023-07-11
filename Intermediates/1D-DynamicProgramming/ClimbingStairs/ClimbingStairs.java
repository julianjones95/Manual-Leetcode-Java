


public class ClimbingStairs {

	
	public static void main(String[] args) {

		int[] input = {2,3};

		int[] output = {2,3};

		for(int i=0; i<input.length; i++) {
			if(waysToClimb(input[i]) == output[i]) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
			}
		}

		return;
	}

	public static int waysToClimb(int numberSteps) {


		int[] dp = new int[numberSteps];

		dp[0] = 1;
		dp[1] = 2;

		for(int i=2; i<numberSteps; i++) {
			dp[i] = dp[i-1] + dp[i-2]; 
		
		}



		return dp[numberSteps-1];
	}

}
