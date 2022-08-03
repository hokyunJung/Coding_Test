import java.util.*;

class Party implements Comparable<Party> {
	int t;
	Character s;
	Party(int t, char s) {
		this.t = t;
		this.s = s;
	}

	@Override
	public int compareTo(Party o) {
		if(this.t == o.t) return this.s - o.s;
		else return this.t - o.t;
	}
}

class Main {
	//시간을 start, end로 구분해 저장 후 시간순으로 정렬 그다음 s 일때 count+1 e 일대 count-1
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		ArrayList<Party> arr = new ArrayList<>();

		int n = kb.nextInt();
		for (int i = 0; i < n; i++) {
			
			int t = kb.nextInt();
			char s = 's';
			arr.add(new Party(t , s));

			t = kb.nextInt();
			s = 'e';
			arr.add(new Party(t, s));
		}

		Collections.sort(arr);

		int answer = 0;
		int count = 0;
		int time = 0;
		for (Party p : arr) {
			if(p.s == 's') count++;
			else count--;

			answer = Math.max(answer, count);
		}

		System.out.println(answer);
	}
}
