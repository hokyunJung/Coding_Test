import java.util.*;

class Main {
	static int n;
	static int[][] board;
	static int[] diX = {0, 1, 1, 1, 0, -1, -1, -1};
	static int[] diY = {-1, -1, 0, 1, 1, 1, 0, -1};

	public int DFS(int x, int y) {
		board[x][y] = 0;

		for (int i = 0; i < diX.length; i++) {
			int nx = x + diX[i];
			int ny = y + diY[i];
			if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
				DFS(nx, ny);
			}
		}

		return 1;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		n = kb.nextInt();
		board = new int[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0 ; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}

		int sum = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0 ; j < n; j++) {
				if(board[i][j] == 1) {
					sum+=T.DFS(i, j);
				}
			}
		}

		System.out.println(sum);
	}
}
