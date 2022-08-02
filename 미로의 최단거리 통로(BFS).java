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
    //       0.-1
    //  -1.0 0.0 1.0
    //       0.1
    static int[] dyX = {0, 1, 0, -1};
    static int[] dyY = {-1, 0, 1, 0};
    static int n = 7;
    static int[][] arr = new int[n][n];
    static int answer = 1;
    static Queue<Point> q = new LinkedList<>();

    public void BFS(int x, int y) {
        
        while(!q.isEmpty()) {
            int qSize = q.size();
            
            for (int s = 0; s < qSize; s++) {
                Point cp = q.poll();

                for (int i = 0; i < 4; i++) {
                    int nx = cp.x + dyX[i];
                    int ny = cp.y + dyY[i];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 0) {
                        arr[nx][ny] = 1;
                        q.offer(new Point(nx, ny));
                        
                        if (nx == n -1 && ny == n -1) {
                            return;
                        }
    
                    }
                }
            }
            
            answer++;
        }

        answer = -1;
    }

    //찾았으면 끝내면 될듯...

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        arr[0][0] = 1;
        q.offer(new Point(0, 0));
        T.BFS(0, 0);

        System.out.println(answer);
    }
}
