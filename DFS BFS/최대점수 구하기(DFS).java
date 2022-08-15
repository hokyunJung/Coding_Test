import java.util.*;

class Exam {
    int s;
    int t;
    Exam(int s, int t) {
        this.s = s;
        this.t = t;
    }
}

class Main {
    static int n, m, max = Integer.MIN_VALUE;
    static ArrayList<Exam> arr;

    public void DFS(int L, int tSum, int sSum) {
        if(tSum > m) {
            return;
        }
        if(L >= n) return;
        if(tSum == m) {
            //System.out.print(sSum + " ");
            max = Math.max(max, sSum);
            return;
        } else {
            DFS(L+1, tSum + arr.get(L).t, sSum + arr.get(L).s);
            DFS(L+1, tSum, sSum);
        }
    }

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new Exam(kb.nextInt(), kb.nextInt()));
        }

        T.DFS(0, 0, 0);

        System.out.println(max);
    }
}
