import java.util.*;

class Main {

	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();
		Queue<Integer> q = new LinkedList<>();

		for (int s = 1; s <= n; s++) q.offer(s);

		int i = 0;
		while(q.size() != 1) {
			i++;
			int v = q.poll();
			if(i == k) {
				i = 0;
			} else {
				q.offer(v);
			}
		}
		
		System.out.println(q.peek());
	}
}
