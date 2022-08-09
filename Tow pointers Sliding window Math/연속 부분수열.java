import java.util.*;

class Main {
	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

		int answer = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int k = i; k < n; k++) {
				sum+=arr[k];
				if(sum > m) break;
				if(sum == m) {
					answer++;
					break;
				}
			}
			
		}

		System.out.println(answer);
	}
}
