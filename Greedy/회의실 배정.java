import java.util.*;

class Comf implements Comparable<Comf> {
	int s;
	int e;
	Comf(int s, int e) {
		this.s = s;
		this.e = e;
	}

	@Override
	public int compareTo(Comf o) {
		if(this.e == o.e) return this.s - o.s;
		else return this.e - o.e;
	}
}

class Main {
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		ArrayList<Comf> arr = new ArrayList<>();

		int n = kb.nextInt();
		for (int i = 0; i < n; i++) {
			arr.add(new Comf(kb.nextInt(), kb.nextInt()));
		}

		Collections.sort(arr);

		int answer = 1;
		Comf t = arr.get(0);
		for (int i = 1; i < n; i++) {
			if ( t.e <= arr.get(i).s ) {
				answer++;
				t = arr.get(i);
			}
			
		}

		System.out.println(answer);
	}
}
