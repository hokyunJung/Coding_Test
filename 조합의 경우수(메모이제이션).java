import java.util.*;

class Main {

    static int[][] arr;
    static int n;
    static int r;

    public int DFS(int n, int r) {
        if (arr[n][r] != 0) return arr[n][r];
        if (r == 0 || n == r) {
            return 1;
        } else {
            return arr[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }

    }


    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        arr = new int[n+1][n+1];
        
        r = kb.nextInt();

        System.out.println( T.DFS(n, r) );
    }
}
