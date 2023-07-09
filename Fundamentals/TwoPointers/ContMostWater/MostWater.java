
public class MostWater {


	public static void main (String[] args) {


		int[][] input = {
			{1,8,6,2,5,4,8,3,7},
			{1,1}
		}; 

		int[] output = {49, 1};


		for(int i=0; i<input.length; i++) {

			if(waterLevel(input[i]) == output[i]) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
				System.out.println(waterLevel(input[i]));
			}

		}

		return;
	}


	public static int waterLevel(int[] heights){

		int l = 0;
		int r = heights.length -1;
		int max = 0;


		while(l != r) {


			if(heights[r] > heights[l]) {

				int curr = (heights[l]) * (r - l);
				
				if ( curr > max) {
					max = curr;
				}
			
				l++;

			}
			else {	
				int curr = (heights[r]) * (r - l);
				
				if ( curr > max) {
					max = curr;
				}
			
				r--;
			}


		}

		return max;


	}

}
