import java.util.*;

class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static int[] ch;
    static int n;
    static int cnt = 0;

    public void DFS(int s) {
        if(s == n) {
            cnt++;
            return;
        } else {
            for(int np : graph.get(s)) {
                if(ch[np] == 0) {
                    ch[np] = 1;
                    DFS(np);
                    ch[np] = 0;
                }
            }
        }
        
    }

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        int m = kb.nextInt();

        ch = new int[n+1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            graph.get(kb.nextInt()).add(kb.nextInt());
        }
        
        
        ch[1] = 1;
        T.DFS(1);
        
        System.out.println(cnt);
    }
}
