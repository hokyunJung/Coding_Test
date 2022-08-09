import java.util.*;

class Main {
	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = i+1;

		int answer = 0;
		for (int i = 0; i <= n/2; i++) {
			int sum = 0;
			for (int k = i; ; k++) {
				sum+=arr[k];
				if(sum > n) break;
				if(sum == n) {
					answer++;
					break;
				}
			}
			
		}

		System.out.println(answer);
	}
}
