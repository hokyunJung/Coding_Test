import java.util.*;

class Main {
    static int n;
    public int DFS(int v) {
        if (v == 1) {
            return 1;
        } else {
            return v * DFS(v-1);
        }
    }

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();

        System.out.println(T.DFS(n));
    }
}
