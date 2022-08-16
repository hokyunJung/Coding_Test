import java.util.*;

class Main {

    static int n;
    static int m;
    static int[] p;

    public void DFS(int L, int start) {
        if (L == m) {
            for (int x : p) {
                System.out.print(x + " ");
            }
            System.out.println();
            return;
        } else {
            for (int i = start; i <= n; i++) {
                p[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    //D(L, start) start값을 주는걸 생각 못했고... start+1 이후부터 돌리는걸 생각 못했어ㅠㅠ
    /*
                  1
    10        20     30    40
  12 13 14   23 24   34
    */

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        p = new int[m];

        T.DFS(0, 1);
        
    }
}
