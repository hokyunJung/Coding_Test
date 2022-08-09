import java.util.*;

class Main {
	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		int n = kb.nextInt();
		for (int i = 0; i < n; i++) arr.add(kb.nextInt());

		int m = kb.nextInt();
		for (int i = 0; i < m; i++) {
			int v = kb.nextInt();
			if(arr.contains(v)) {
				arr2.add(v);
			}
		}

		Collections.sort(arr2);
		for(int x : arr2) System.out.print(x+" ");
	}
}
