import java.util.*;

class Main {

    static int[] pm;
    static int[] ch;
    static int[] arr;
    static int n;
    static int m;


    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
            return;
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {//i번째가 체크되어있으면 탐색 하지말라.
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }

    /*
                                []
L=0        pm[3]              pm[6]               pm[9]
        ch[1,0,0]           ch[0,1,0]           ch[0,0,1]

L=1   pm[3,6]  pm[3,9]    pm[6,3]  pm[6,9]     pm[9,3]  pm[9,6]
     ch[1,1,0] ch[1,0,1] ch[1,1,0] ch[0,1,1]  ch[1,0,1] ch[0,1,1]

L=2 print pm[3,6]

     */

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        arr = new int[n];
        m = kb.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        pm = new int[m];
        ch = new int[n];

        T.DFS(0);
    }
}
