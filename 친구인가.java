import java.util.*;

class Main {
	static int[] parent;

  //기본적으로 disjoin 알고리즘 문제...
  //union 과 find를 외워야 한다...
  //parent 변수는 부모 노드의 값을 가진다.

	public int Find(int v) {
		if (v == parent[v]) return parent[v];
		else return parent[v]=Find(parent[v]);
	}

	public void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if (fa != fb) parent[fa] = fb;
	}

	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		parent = new int[n+1];
		for (int i = 0 ; i < n+1; i++) parent[i] = i;
		int m = kb.nextInt();

		for (int i = 0 ; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			T.Union(a, b);
		}

		int ia = kb.nextInt();
		int ib = kb.nextInt();

		if (T.Find(ia) == T.Find(ib)) System.out.println("YES");
		else System.out.println("NO");

	}
}
