import java.util.*;

class Lect implements Comparable<Lect> {
	int m;
	int d;
	Lect(int m, int d) {
		this.m = m;
		this.d = d;
	}

	@Override
	public int compareTo(Lect o) {
		if(this.d == o.d) return o.m - this.m;
		else return o.d - this.d;
	}
}

class Main {
	//d 기준으로 정렬
  //최대 day 구하고
  //PriorityQueue 사용해서 가장 높은 값이 poll되도록 reverseOrder 하고...
  //최대 큰 날 부터 강의가 가능한 날자에 도달하면 큐에 넣어
  //매일 q에 들어있는 강의를 소모해..
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		ArrayList<Lect> arr = new ArrayList<>();

		int maxDay = 0;
		int n = kb.nextInt();
		for (int i = 0; i < n; i++) {
			int m = kb.nextInt();
			int d = kb.nextInt();
			arr.add(new Lect(m, d));
			maxDay = Math.max(maxDay, d);
		}

		Collections.sort(arr);

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		int answer = 0;
		for (int day = maxDay; day > 0 ; day--) {
			for (Lect l : arr) {
				if (day == l.d) {
					pq.offer(l.m);
				}
			}
			if (pq.peek() != null) answer += pq.poll();
		}
		

		System.out.println(answer);
	}
}
