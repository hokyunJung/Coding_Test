import java.util.*;

class Main {
    static int c, n;
    static int[] arr;

    public void DFS(int L, int sum) {
        if(sum > c) {
            return;
        }
        if(L == n) {
            System.out.print(sum + " ");
            return;
        } else {
            DFS(L+1, sum+arr[L]);
            DFS(L+1, sum);
        }
    }

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        c = kb.nextInt();
        n = kb.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        T.DFS(0, 0);
    }
}
