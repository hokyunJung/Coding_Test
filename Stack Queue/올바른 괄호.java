import java.util.*;

class Main {


	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		String str = kb.next();

		Stack<Character> s = new Stack<>();

		String answer = "YES";
		for(char c : str.toCharArray()) {
			if(c == '(') s.push(c);
			else {
				if(s.size() == 0) {
					answer = "NO";
					break;
				}
				s.pop();
			}
		}

		if(s.size() != 0) answer = "NO";

		System.out.println(answer);
	}
}

