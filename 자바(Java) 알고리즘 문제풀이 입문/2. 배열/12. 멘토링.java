import java.util.*;

class Main {
	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] arr = new int[m+1][n+1];
		int answer = 0;

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}

		for (int i = 1; i <= n; i++) { // 멘토
			for (int j = 1; j <= n; j++) { // 멘티
				if (i != j) {
					int oi = 0;
					int oj = 0;
					int sum = 0;
					for (int k = 1; k <= m; k++) { //m번의 테스트
						for (int o = 1; o <= n; o++) { //등수 찾기
							if(arr[k][o] == i) oi = o;
							if(arr[k][o] == j) oj = o;
						}
						if(oi < oj) sum++;
					}
					if(sum == m) answer++;
				}
			}
		}

		System.out.println(answer);
	}
}
