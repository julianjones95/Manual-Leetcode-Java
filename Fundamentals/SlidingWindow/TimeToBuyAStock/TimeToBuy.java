
public class TimeToBuy {

	public static void main(String[] args) {


		int[][] input = {
				{7,1,5,3,6,4},
				{7,6,4,3,1},
		};

		int[] output = {5,0};
		
		for(int i=0; i<input.length; i++) {
			
			if(buy(input[i]) == output[i]) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
			}

		}

		return;
	}

	public static int buy(int[] prices) {
	
		int min =99999999;
		int max = 0;
		int profit = 0;
		
		for(int i=0; i<prices.length; i++) {

			profit = prices[i] - min;

			if(prices[i]<min) {
				min = prices[i];
			}
			else if(profit > max) {
				max = profit;
			}
		}

		return max;
	}
}
