import java.util.*;

class Main {
	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		ArrayList<Integer> arrs = new ArrayList<>();
		int n = kb.nextInt();
		for (int i = 0; i < n; i++) arrs.add(kb.nextInt());
		int m = kb.nextInt();
		for (int i = 0; i < m; i++) arrs.add(kb.nextInt());

		Collections.sort(arrs);

		for(int x : arrs) System.out.print(x+" ");
	}
}
