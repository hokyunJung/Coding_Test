import java.util.*;

class Main {
	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[][] arr = new int[n+1][n+1];
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}

		//1번 학생 -> 1학년 ~ 5학년 -> 1학년일때 2번부터 5번까지 비교, 2학년일때 2번부터 5번까지 비교
		//2번 학생 -> 1학년 ~ 5학년 -> 1학년일때 1번부터 5번까지 비교, 2학년일때 1번부터 5번까지 비교
		int max = 0;
		for (int i = 1; i <= n ; i++) {
			int sum = 0;
			for (int j = 1; j <= n ; j++) {
				for(int k = 1; k <= n ; k++) {
          
					if(arr[i][k] == arr[j][k]) {//이거 틀렸었어.. 다시 풀어봐 나중에...
						sum++;
						break;
					} 
				}
			}
			if (sum > max) {
				answer = i;
				max = sum;
			} 
		}

		System.out.println(answer);

	}
}
