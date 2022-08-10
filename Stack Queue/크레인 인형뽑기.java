import java.util.*;

class Main {

	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[][] board = new int[n][n];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				board[i][j] = kb.nextInt();

		int m = kb.nextInt();
		int[] move = new int[m];
		for(int i = 0; i < m; i++) move[i] = kb.nextInt() - 1;

		int answer = 0;
		Stack<Integer> s = new Stack<>();
		for (int i : move) {
			for(int j = 0; j < n; j++) {
				if(board[j][i] != 0) {
					int v = board[j][i];
					board[j][i] = 0;
					if(!s.isEmpty() && s.peek() == v) {
						answer++;
						s.pop();
					} else {
						s.push(v);
					}
					break;
				}
			}
		}

		System.out.println(answer * 2);
	}
}

