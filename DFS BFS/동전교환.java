import java.util.*;

//BFS, DFS 둘다 풀린다...
class Main {
    static int n, m;
    static int[] arr;

    public void BFS() {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(m);

        int cnt = 0;
        boolean isFine = false;
        while(!q.isEmpty()) {
            if (isFine) break;
            int qSize = q.size();
            for(int i = 0; i < qSize; i++) {
                int last = q.poll();
                for(int j = 0; j < arr.length; j++) {
                    int nLast = last - arr[j];
                    if(nLast == 0) {
                        isFine = true;
                    }
                    if (nLast >= 0) {
                        //System.out.print(nLast+" ");
                        q.offer(nLast);
                    }
                }
            }
            //System.out.println();
            cnt++;
        }
        System.out.println(cnt);
    }

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        m = kb.nextInt();


        
        T.BFS();

        
    }
}
