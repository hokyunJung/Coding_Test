import java.util.*;

class Main {
    static int n;
    public void DFS(int v) {
        if (v == 0) {
            return;
        } else {
            int m = v/2;
            int last = v%2;
            DFS(m);
            System.out.print(last);

        }
    }

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();

        T.DFS(n);
    }
}
