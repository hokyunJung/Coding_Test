import java.util.*;

class Main {
    static int n;
    public void DFS(int L) {
        if (L > n) { //1. 재귀는 종료 조건이 있다
            return;
        } else { //그외는 다시 호출한다.
            System.out.print(L+" ");
            DFS(L+1);
        }
    }

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();

        T.DFS(1);
    }
}
