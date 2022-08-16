import java.util.*;

class Main {

    static int n, cnt=0;
    static int[][] board;
    static int[] drX = {0, 1, 0, -1};
    static int[] drY = {-1, 0, 1, 0};

    public void DFS(int x, int y) {
        if(x == n-1 && y == n-1) {
            cnt++;
            return;
        } else {
            for(int i = 0; i < drX.length; i++) {
                int nx = x + drX[i];
                int ny = y + drY[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 0) {
                    board[nx][ny] = 1; //탐색한 곳
                    DFS(nx, ny);
                    board[nx][ny] = 0; //복귀시 0으로...
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = 7;

        board = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        board[0][0] = 1; //출발값 지정해주고
        T.DFS(0, 0);
        System.out.println(cnt);
    }
}
