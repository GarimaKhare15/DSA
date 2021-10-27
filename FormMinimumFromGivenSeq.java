import java.util.*;

class FormMinimumFromGivenSeq {
    static String formMinimum(String s, Stack<Integer> stack) {
		String ans = "";
		
		for (int i = 0; i <= s.length(); i++) {
			stack.push(i+1);
			if(i == s.length() || s.charAt(i) == 'I') {
				while(!stack.isEmpty()) {
					ans+=stack.pop().toString();
				}
				
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		Stack<Integer> stack = new Stack<>();
		System.out.println(formMinimum(str,stack));

	}
}