import java.util.*;

class Main {

	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		Stack<Integer> s = new Stack<>();
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) {
				s.push(Integer.parseInt(c+""));
			} else {
				int rt=s.pop();
				int lt=s.pop();
				if(c=='+') s.push(lt+rt);
				else if(c=='-') s.push(lt-rt);
				else if(c=='*') s.push(lt*rt);
				else if(c=='/') s.push(lt/rt);
			}
		}

		System.out.println(s.pop());
	}
}

