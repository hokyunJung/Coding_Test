import java.util.*;

class Main {
    static int n;
    static int[] arr;
    public int DFS(int v) {
        if (arr[v] != 0) {
            return arr[v];
        } 
        if(v == 1 || v == 2) {
            return arr[v] = 1;
        }
        else {
            return arr[v] = DFS(v-1) + DFS(v-2);
        }
    }

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        arr = new int[n+1];

        T.DFS(n);
        for(int x: arr) System.out.print(x+" ");
    }
}
