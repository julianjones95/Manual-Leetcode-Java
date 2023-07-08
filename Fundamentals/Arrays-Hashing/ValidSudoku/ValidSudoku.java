import java.util.*;


public class ValidSudoku {

	public static void main(String[] args) {

		String[][][] input ={ 
			{{"5","3",".",".","7",".",".",".","."}
			,{"6",".",".","1","9","5",".",".","."}
			,{".","9","8",".",".",".",".","6","."}
			,{"8",".",".",".","6",".",".",".","3"}
			,{"4",".",".","8",".","3",".",".","1"}
			,{"7",".",".",".","2",".",".",".","6"}
			,{".","6",".",".",".",".","2","8","."}
			,{".",".",".","4","1","9",".",".","5"}
			,{".",".",".",".","8",".",".","7","9"}},

			{{"8","3",".",".","7",".",".",".","."}
			,{"6",".",".","1","9","5",".",".","."}
			,{".","9","8",".",".",".",".","6","."}
			,{"8",".",".",".","6",".",".",".","3"}
			,{"4",".",".","8",".","3",".",".","1"}
			,{"7",".",".",".","2",".",".",".","6"}
			,{".","6",".",".",".",".","2","8","."}
			,{".",".",".","4","1","9",".",".","5"}
			,{".",".",".",".","8",".",".","7","9"}}
		};

		boolean[] output = {true,false};


		for(int i=0; i<input.length; i++) {
			if(checkBoard(input[i]) == output[i]){
				System.out.println("Passed");	
			}
			else{
				System.out.println("Failed");
			}
		}

		return;

	}

	public static boolean checkBoard(String[][] board) {

		HashMap<String, Integer> hashCheck = new HashMap();

		for(int i=0; i<board.length; i++) {
			hashCheck.clear();
			for(int j=0; j< board.length; j++) {
			
				if(board[i][j] == ".") {
					continue;
				}

				if( hashCheck.getOrDefault(board[i][j],0) == 0) {
					hashCheck.put(board[i][j],1);
				}
				else {
					
					return false;
				}
				
			}
		}
		
		for(int i=0; i<board.length; i++) {
			hashCheck.clear();
			for(int j=0; j< board.length; j++) {
				
				if(board[j][i] == ".") {
					continue;
				}

				if(hashCheck.getOrDefault(board[j][i],0) == 0) {
					hashCheck.put(board[j][i],1);
				}
				else {
					return false;
				}
				
			}
		}
		
		return true;

	}




}

