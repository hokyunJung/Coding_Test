import java.util.*;

class Main {

	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		String i = kb.next();

		String p = kb.next();

		Queue<Character> q = new LinkedList<>();
		for (int s = 0; s < i.length(); s++) q.offer(i.charAt(s));
		
		for (int s = 0; s < p.length(); s++) {
			if(!q.isEmpty() && p.charAt(s) == q.peek()) q.poll();
		}

		if(q.size() == 0) System.out.println("YES");
		else  System.out.println("NO");
		
	}
}
