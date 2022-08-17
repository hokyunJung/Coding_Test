import java.util.*;

class Ver {
	int e;
	int v;
	Ver(int e, int v) {
		this.e=e;
		this.v=v;
	}
}

class Main {
	static ArrayList<ArrayList<Ver>> graph = new ArrayList<ArrayList<Ver>>();
	static int[] ch, dis;

	public void sol(Ver s) {
		Queue<Ver> q = new LinkedList<>();
		q.offer(s);
		ch[s.e] = 1;
		dis[s.e] = 0;

		while(!q.isEmpty()) {
			int qSize = q.size();
			for(int i = 0; i < qSize; i++) {
				Ver cv = q.poll();

				for(Ver nv : graph.get(cv.e)) {
					int nvalue = dis[cv.e] + nv.v;
					if(dis[nv.e] > nvalue) {
						dis[nv.e] = nvalue;
						q.offer(nv);
					}
				}
				
			}
		}
	}

	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		ch = new int[n+1];
		dis = new int[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE);

		for(int i = 0; i <= n; i++) graph.add(new ArrayList<>());

		int m = kb.nextInt();

		for(int i = 0; i < m; i++) {
			graph.get(kb.nextInt()).add(new Ver(kb.nextInt(), kb.nextInt()));
		}

		T.sol(new Ver(1, 0));

		for(int x : dis) {
			System.out.print(x+" ");
		}
	}
}
