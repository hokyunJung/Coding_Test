import java.util.*;

class Vertex implements Comparable<Vertex> {
	int id;
	int v;
	Vertex(int id , int v) {
		this.id = id;
		this.v = v;
	}

	@Override
	public int compareTo(Vertex v) {
		return this.v - v.v;
	}
}

class Main {
	static int ch[];
	static ArrayList<ArrayList<Vertex>> graphs = new ArrayList<ArrayList<Vertex>>();
	static int sum = 0;

	public void BFS(int s) {
		PriorityQueue<Vertex> q = new PriorityQueue<>();
		q.offer(new Vertex(s, 0));		

		while(!q.isEmpty()) {
			Vertex cv = q.poll();
			
			if (ch[cv.id] == 0) {
				System.out.println(cv.id + " , " + cv.v);

				ch[cv.id] = 1;
				sum += cv.v;	
				for (Vertex nv : graphs.get(cv.id)) {
					if (ch[nv.id] == 0) q.offer(new Vertex(nv.id, nv.v));
				}
			}

			
		}
	}

	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int v = kb.nextInt();
		ch = new int[v+1];

		int e = kb.nextInt();

		for (int i = 0; i < v+1; i++) {
			graphs.add(new ArrayList<Vertex>());
		}

		for (int i = 0; i < e; i++) {
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			//양방향이니까 이렇게 해야해ㅠㅠ
			graphs.get(a).add(new Vertex(b, c));
			graphs.get(b).add(new Vertex(a, c));
		}

		T.BFS(1);

		System.out.println(sum);
	}
}
