import java.util.*;

//시작점, 도착점, 가중치 class 만들고
//가중치 기준으로 값을 정렬...
/*
2 9 8 
2 3 10
1 2 12
9 8 15
2 8 17
3 4 18
1 9 25
7 8 35
5 7 38
4 5 44
3 7 55
5 6 60

f(2)와 f(9)가 같은 조합(Find)인가? NO -> Union
*/

class Vertex implements Comparable<Vertex> {
	int s;
	int e;
	int v;
	Vertex(int s, int e , int v) {
		this.s = s;
		this.e = e;
		this.v = v;
	}

	@Override
	public int compareTo(Vertex v) {
		return this.v - v.v;
	}
}

class Main {
	static int[] parent;
	public int Find(int v) {
		if(v == parent[v]) {
			return parent[v];
		} else {
			return parent[v] = Find(parent[v]);
		}
	}

	public void Union(int s, int e) {
		int fs = Find(s);
		int fe = Find(e);
		if (fs != fe) parent[fs] = fe;
	}

	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int v = kb.nextInt();
		int e = kb.nextInt();
		parent = new int[v+1];
		for (int i = 0; i < v+1; i++) parent[i] = i;
		ArrayList<Vertex> arrs = new ArrayList<>();
		for (int i = 0; i < e; i++) {
			arrs.add(new Vertex(kb.nextInt(), kb.nextInt(), kb.nextInt()));
		}

		Collections.sort(arrs);

		int sum = 0;
		for (Vertex cv : arrs) {
			if (T.Find(cv.s) != T.Find(cv.e)) {
				T.Union(cv.s, cv.e);
				sum+=cv.v;
			}
		}

		System.out.println(sum);
	}
		
}
