import java.util.*;

class Main {
    //       0.-1
    //  -1.0 0.0 1.0
    //       0.1
    static int[] dyX = {0, 1, 0, -1};
    static int[] dyY = {-1, 0, 1, 0};
    static int n = 7;
    static int[][] arr = new int[n][n];
    static int answer = 0;

    public void DFS(int x, int y) {
        if (x == n-1 && y == n-1) {
            answer++;
            return;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dyX[i];
                int ny = y + dyY[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 0) {
                    arr[nx][ny] = 1;
                    DFS(nx, ny);
                    arr[nx][ny] = 0;
                }
            }
        }
    }

    //탐색 할 곳을 1로 만들고 다시 복귀 할땐 0으로 만들어야해..

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        arr[0][0] = 1;
        T.DFS(0, 0);

        System.out.println(answer);
    }
}
