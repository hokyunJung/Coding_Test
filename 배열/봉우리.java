import java.util.*;

class Main {
	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int[] dirX = {0, 1, 0, -1};
		int[] dirY = {-1, 0, 1, 0};
		int n = kb.nextInt();
		int[][] arr = new int[n+2][n+2];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}

		//이중포문안에서 상우좌우 값 체크
		int sum = 0;
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= n ; j++) {
				boolean isTop = true;
				for (int k = 0; k < dirX.length; k++) {
					if(arr[i + dirX[k]][j + dirY[k]] > arr[i][j]) {
						isTop = false;
						break;
					}
				}
				if(isTop) sum++;
			}
		}
		System.out.println(sum);

	}
}
