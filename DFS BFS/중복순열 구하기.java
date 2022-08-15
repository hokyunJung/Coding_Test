import java.util.*;

class Main {
    static int n, m;
    static int[] arr;

    public void DFS(int L) {
        if(L == n-1) {
            for(int x : arr) System.out.print(x+" ");
            System.out.println();
            return;
        } else {
            for (int i = 1; i <= n; i++) {
                if(arr[L] == 0) {
                    arr[L] = i;
                    DFS(L+1);
                    arr[L] = 0;
                }
            }
        }
    }

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[m];
        
        T.DFS(0);

        
    }
}
