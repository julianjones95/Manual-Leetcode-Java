import java.util.*;

public class CarFleet {

	public static void main(String[] args) {
		
		int[][] inputPosition = {
			{10,8,0,5,3},
			{3},
			{0,2,4}
		};

		int [][] inputSpeed = {
			{2,4,1,1,3},
			{3},
			{4,2,1}
		};

		int[] target = {12,10,100};

		int[] output = {3,1,1};


		for( int i=0; i<inputPosition.length; i++) {
			if(getFleets(inputPosition[i], inputSpeed[i], target[i])  == output[i]) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
			}


		}
	}

	public static int getFleets(int[] position, int[] speed, int target ) {

		float time[]=new float[target+1];
		float max=0;
		
		// This sorts our array by making an array of length of target
		// Once we have this array we can insert time data at positions
		for(int i=0;i<position.length;i++){
		    time[position[i]] = (float)(target-position[i])/speed[i];
		}
		System.out.println(Arrays.toString(time));

		// This looks backward for cars arriving at a time
		// which is higher or equal to the current time
		int count = 0;
		for(int i=target; i>=0; i--) {
			if(time[i]>max) {
				count++;
				max = time[i];
			}
		}
		return count;
	}
}
