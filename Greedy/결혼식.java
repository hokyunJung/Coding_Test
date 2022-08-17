import java.util.*;

class Lec implements Comparable<Lec> {
	int t;
	Character s;
	Lec(int t, Character s) {
		this.t=t;
		this.s=s;
	}

	@Override
	public int compareTo(Lec o) {
		if(this.t == o.t) return this.s-o.s;
		return this.t - o.t;
	}
}

class Main {
	//시간을 start, end로 구분해 저장 후 시간순으로 정렬 그다음 s 일때 count+1 e 일대 count-1
	public void sol(ArrayList<Lec> arr) {
		int maxCnt = Integer.MIN_VALUE;
		int cnt=0;
		for(Lec l : arr) {
			if(l.s == 's') cnt++;
			else cnt--;
			maxCnt = Math.max(maxCnt, cnt);
		}

		System.out.println(maxCnt);
	}

	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		ArrayList<Lec> arr = new ArrayList<>();
		int n = kb.nextInt();
		for(int i=0; i<n; i++) {
			arr.add(new Lec(kb.nextInt(), 's'));
			arr.add(new Lec(kb.nextInt(), 'e'));
		}

		Collections.sort(arr);

		T.sol(arr);
	}
}
