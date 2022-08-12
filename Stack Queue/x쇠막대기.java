import java.util.*;

class Main {

	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		Stack<Character> s = new Stack<>();
		
		int cnt = 0;
		for (int i = 0; i < str.toCharArray().length; i++) {
			if(str.charAt(i) == '(') s.push(str.charAt(i));
			else {
				s.pop();
				if(str.charAt(i - 1) == '(') {
					cnt += s.size();
				} else {
					cnt+=1;
				}
			}
		}

		System.out.println(cnt);
	}
}
