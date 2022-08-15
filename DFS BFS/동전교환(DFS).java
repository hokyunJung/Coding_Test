import java.util.*;

class Main {

    static int[] coin;
    static int n;
    static int m;
    static int minCount = Integer.MAX_VALUE;

    public void DFS(int L, int last) {
        if (L >= minCount ) return;

        if (last <= 0) {
            if (last == 0) {
                minCount = Math.min(minCount, L);
            }
            return;
        } else {
            for (int i = 0; i < n; i++) DFS(L+1, last-coin[i]);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = kb.nextInt();
        }

        m = kb.nextInt();

        T.DFS(0, m);

        System.out.println(minCount);
    }
}
