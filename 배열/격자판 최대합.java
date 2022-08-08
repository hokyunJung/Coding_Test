import java.util.*;

class Main {
	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}

		int max = Integer.MIN_VALUE;
		int sum3 = 0, sum4 = 0;
		//이중포문
		for (int i = 0; i < n; i++) {
			int sum1 = 0, sum2 = 0;
			for (int j = 0; j < n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			sum3 += arr[i][i];
			sum4 += arr[n -1 - i][n -1 - i];
			max = Math.max(max, sum1);
			max = Math.max(max, sum2);
		}
		
		max = Math.max(max, sum3);
		max = Math.max(max, sum4);

		System.out.println(max);
	}
}
