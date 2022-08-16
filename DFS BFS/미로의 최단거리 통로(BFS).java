import java.util.*;

class Point {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Main {

    static int n, cnt=0;
    static int[][] board;
    static int[] drX = {0, 1, 0, -1};
    static int[] drY = {-1, 0, 1, 0};
    static boolean isFind = false;

    public void BFS(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));

        while(!q.isEmpty()) {
            if(isFind) break;
            cnt++;

            int qSize = q.size();
            for(int i = 0; i < qSize; i++) {
                Point cp = q.poll();
                for(int p = 0; p < drX.length; p++) {
                    int nx = cp.x + drX[p];
                    int ny = cp.y + drY[p];

                    if(nx == 6 && ny == 6) {
                        isFind = true;
                        break;
                    }

                    if(nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && board[nx][ny] == 0) {
                        board[nx][ny] = 1;
                        q.offer(new Point(nx, ny));
                    }
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

        board[0][0] = 1;
        T.BFS(0, 0);

        if(isFind) System.out.println(cnt);
        else System.out.println(-1);
    }
}
