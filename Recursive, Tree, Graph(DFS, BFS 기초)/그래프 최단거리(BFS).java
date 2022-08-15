import java.util.*;

class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static int[] ch;
    static int[] dis;
    static int n;

  /*
  ch -> 방문했냐?
  dis -> 기존 거리 값에서 +1 -> 0 3 1 1 2 2
  
  예상 루트
  1 3 (4는 이미 앞에서 방문했으므로 무시함)
  1 4 5
  1 4 6
  1 4 6 2
  */
  
    public void BFS(int s) {
        Queue<Integer> q = new LinkedList<Integer>();

        ch[s] = 1;
        dis[s] = 0;
        q.offer(s);

        while(!q.isEmpty()) {
            int cp = q.poll();

            for(int np : graph.get(cp)) {
                if(ch[np] == 0) {
                    dis[np] = dis[cp] + 1;
                    ch[np] = 1;
                    q.offer(np);
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
        dis = new int[n+1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            graph.get(kb.nextInt()).add(kb.nextInt());
        }
        
        T.BFS(1);
        
        for(int x : dis) System.out.print(x + " ");
    }
}
