import java.util.*;

class Pa {
	int id;
	int v;
	Pa(int id, int v) {
		this.id = id;
		this.v = v;
	}
}

class Main {

	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();

		ArrayList<Pa> arr = new ArrayList<>();

		Queue<Pa> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			Pa v = new Pa(i, kb.nextInt());
			arr.add(v);
			q.offer(v);
		}
		
		
		int cnt = 0;

		while(!q.isEmpty()) {
			Pa v = q.poll();
			int max = 0;
			int pi = 0;
			for (int i = 0; i < arr.size(); i++) {
				max = Math.max(max, arr.get(i).v);
				if(max == arr.get(i).v) pi = i;
			}
			if(v.v == max) {
				cnt++;
				arr.remove(pi);
				if(v.id == m) {
					System.out.println(cnt);
					return;
				} 
			} else {
				q.offer(v);
			}
		}

	}
}
