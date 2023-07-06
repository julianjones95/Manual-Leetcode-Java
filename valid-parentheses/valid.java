import java.util.*;

public class valid{

	public static void main(String[] args) {

		// Should be true
	    	System.out.println(isValid("()"));
	    	System.out.println(isValid("(){}[]"));
	    	System.out.println(isValid("(())"));
	    	System.out.println(isValid("([])"));
	    	System.out.println(isValid("{{{}}}"));
	    	System.out.println(isValid("[]"));

		// Should be false
	    	System.out.println(isValid("[["));
	    	System.out.println(isValid("(]"));
	    	System.out.println(isValid("("));
	}

    	public static boolean isValid(String s) {
        	Stack<Character> parens = new Stack<Character>();

		for(int i=0; i<s.length(); i++) {

		    if(s.charAt(i) == '{'  || s.charAt(i) == '[' || s.charAt(i) == '('){
			parens.push(s.charAt(i));
			continue;
		    }

		    else if(parens.isEmpty()) {
			return false;
		    }
		    
		    
		    char top = parens.peek();

		    if(s.charAt(i) == '}' &&  top == '{') {
			parens.pop();
		    }

		    else if(s.charAt(i) == ']' &&  top == '[') {
			parens.pop();
		    }

		    else if(s.charAt(i) == ')' &&  top == '(') {
			parens.pop();
		    }
		    else{
			return false;
		    }
		    
		}


		if (parens.isEmpty()) {
		    return true;
		}

		return false;
	    }

}
