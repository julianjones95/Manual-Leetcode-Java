import java.util.*;

public class ReverseLL {


	public static void main(String[] args) {

		LinkedList<Integer> input = new LinkedList<>();
		
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);


		LinkedList<Integer> output = new LinkedList<>();

		output.add(5);
		output.add(4);
		output.add(3);
		output.add(2);
		output.add(1);
	
		LinkedList<Integer> returnedVal = reverse(input);

		if(returnedVal.equals(output)) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
			System.out.println(returnedVal);
			System.out.println(output);
		}

		return;

	}


	public static LinkedList<Integer> reverse (LinkedList<Integer> head) {

		LinkedList<Integer> temp = new LinkedList<>();
		LinkedList<Integer> out = new LinkedList<>();

		while (!head.isEmpty()) {
		    temp.addFirst(head.poll());
		}

		while (!temp.isEmpty()) {
		    out.add(temp.poll());
		}

		return out;


	}
}
