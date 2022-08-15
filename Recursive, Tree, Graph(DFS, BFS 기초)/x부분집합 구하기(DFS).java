import java.util.*;

class Main {
    static int n;
    static int[] ch; //체크 써야하는데ㅠㅠ 
  /*
                 {}
         100             000
    110     100     010     000
  111 110 101 100 011 010 001 000
  */
    public void DFS(int L) {
        if(L == n) {
            for(int i = 0; i < n; i++) {
                if(ch[i] == 1) System.out.print((i + 1) + " ");
            }
            System.out.println();
            return;
        } else {
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }
    }

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        ch = new int[n];

        T.DFS(0);
    }
}
