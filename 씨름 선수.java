import java.util.*;

class Athl implements Comparable<Athl> {
	int h;
	int w;
	Athl(int h, int w) {
		this.h = h;
		this.w = w;
	}

	@Override
	public int compareTo(Athl o) {
		if(this.w == o.w) return o.h - this.h;
		else return o.w - this.w;
	}
}

class Main {
	static int n;
	static ArrayList<Athl> arrs = new ArrayList<>();
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		n = kb.nextInt();

		for (int i = 0; i < n; i++) {
			arrs.add(new Athl(kb.nextInt(), kb.nextInt()));
		}

		Collections.sort(arrs);

		int answer = 1;

		for (int i = 1; i < arrs.size(); i++) {
			if(!(arrs.get(i - 1).h > arrs.get(i).h && arrs.get(i - 1).w > arrs.get(i).w)) answer++;
		}

			System.out.println(answer);

	}
}
