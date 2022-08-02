import java.util.*;

class Main {

    static int[][] cb;
    static int n;
    static int f;
    static int[] cbv;
    static int[] ch;
    static int[] retv;
    static boolean end = false;

    public int combi(int n, int r) {
        if (cb[n][r] != 0) return cb[n][r];
        if (r == 0 || n == r) {
            return 1;
        } else {
            return cb[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }

    }

    public void DFS(int L, int sum) {
        if (end) return;
        if (L == n) {
            if (sum == f) {
                for(int x : retv) System.out.print(x+" ");
                end = true;
            }
            return;
        } else {
            for (int i = 1; i <= n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    retv[L] = i;
                    //{1 3 3 1} * {x, x, x, x} -> 이걸 어찌 알아?
                    DFS(L+1, sum + retv[L] * cbv[L]); // (1*1)+(2*3)+(3*3)+(4*1) 제일 좌측트리..
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        f = kb.nextInt();
        cb = new int[n+1][n+1];
        cbv = new int[n+1];
        ch = new int[n+1];
        retv = new int[n+1];
        
        for (int i = 0; i < n; i++) {
            cbv[i] = T.combi(n-1, i); //3C0 3C1 3C2 3C3
        }

        for (int i = 0; i < n; i++) {
            System.out.print(cbv[i] + " ");
        }
        System.out.println();

        T.DFS(0, 0);
    }
}
