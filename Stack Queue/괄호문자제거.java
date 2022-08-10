import java.util.*;

class Main {

	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		String str = kb.next();

		Stack<Character> s = new Stack<>();

		String answer = "";
		for(char c : str.toCharArray()) {
			if(c == '(') {
				s.push(c);
			} else if(c == ')') {
				s.pop();
			} else {
				if(s.isEmpty()) {
					answer+=c;
				}
			}
		}

		System.out.println(answer);
	}
}

