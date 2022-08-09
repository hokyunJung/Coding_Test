import java.util.*;

class Main {
	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n - k; i++) {
			int limit = i + k;
			int sum = 0;
			for (int j = i; j < limit; j++) {
				sum+=arr[j];
			}
			max=Math.max(max, sum);
		}

		System.out.println(max);
	}
}
