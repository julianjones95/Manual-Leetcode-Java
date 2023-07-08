
public class comboSum{

	List<Integer> curr = new ArrayList();
	List<List<Integer>> output = new ArrayList();

	public static void main(String[] args){

		comboSum({2,3,6,7},7);
	}


    	public List<List<Integer>> comboSum(int[] candidates, int target) {
		DFS(candidates,target,0,curr);
		return output;
    	}

    	public void DFS(int[] candidates, int target, int start, List<Integer> curr) {
		int sum = 0;
		for (int i : curr) {
		    sum += i;
		}
		if (sum > target) {
		    return;
		}

		if (sum == target) {
		    output.add(new ArrayList<>(curr));
		    return; // Stop recursion for this path
		}

		for (int i = start; i < candidates.length; i++) {
		    curr.add(candidates[i]);
		    DFS(candidates, target, i, curr); // Recursive call with the updated start index
		    curr.remove(curr.size() - 1); // Remove the last added element (backtracking)
		}
	}
}
