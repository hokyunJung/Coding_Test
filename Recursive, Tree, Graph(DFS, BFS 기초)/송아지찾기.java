import java.util.*;

class Main {
    static int[] jump = {1, -1, 5};
    static int[] ch;

    public void BFS(int s, int e) {
        Queue<Integer> q = new LinkedList<Integer>();

        q.offer(s);
        ch[s] = 1;

        int cnt = 0;
        int min = Integer.MAX_VALUE;

        while(!q.isEmpty()) {
            int qSize = q.size();
            for (int j = 0; j < qSize; j++) {
                int pos = q.poll();
                //System.out.print(pos + " ");
                /*
                1    9 7 13
                2    10 14 6 12 18
                3    11 15 19 5 17 23
                4    16 20 24 4 22 28
                5    21 25 29 3 27 33
                */

                if(pos == e) {
                    min = Math.min(min, cnt);
                }
                
                for (int i = 0; i < jump.length; i++) {
                    int nPos = pos + jump[i];
                    if(nPos >= 1 && nPos <= 100 && ch[nPos] == 0) {
                        ch[nPos] = 1;
                        q.offer(nPos);
                    }
                    
                }
            }
            cnt++;
            //System.out.println();
        }

        System.out.println(min);
    }

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int s = kb.nextInt();
        int e = kb.nextInt();

        ch = new int[10001];
        
        T.BFS(s, e);
        

    }
}
