import java.util.*;

class Atl implements Comparable<Atl> {
	int l;
	int w;
	Atl(int l, int w) {
		this.l=l;
		this.w=w;
	}

	@Override
	public int compareTo(Atl o) {
		if(o.w == this.w) return o.l - this.l;
		else return o.w - this.w;
	}
}

class Main {
	public void sol(ArrayList<Atl> arr) {
		int cnt=1;
		for(int i = 1; i < arr.size(); i++) {
			if(arr.get(i).l < arr.get(i-1).l && arr.get(i).w < arr.get(i-1).w) cnt++;
		}

		System.out.println(cnt);
	}

	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		ArrayList<Atl> arr = new ArrayList<>();
		int n = kb.nextInt();
		for(int i=0; i<n; i++) {
			arr.add(new Atl(kb.nextInt(), kb.nextInt()));
		}

		Collections.sort(arr);

		T.sol(arr);
	}
}
