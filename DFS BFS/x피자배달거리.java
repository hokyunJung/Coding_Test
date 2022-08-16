import java.util.*;

class Point {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Main {
    static int n, m, answer=Integer.MAX_VALUE;
    static int pzCnt=0;
    static int[] pzCh;
    static ArrayList<Point> pz = new ArrayList<>(); //피자집
    static ArrayList<Point> hz = new ArrayList<>(); //집

    public void DFS(int L, int start) {
        if(L == m) {
            int sum = 0;
            for (Point h : hz) {
                int dis = Integer.MAX_VALUE;
                for (int p : pzCh) { // 0~5 개의 숫자 중 4개를 뽑은 것
                    dis=Math.min(dis, Math.abs(h.x-pz.get(p).x)+Math.abs(h.y-pz.get(p).y));
                }
                sum+=dis;
            }
            answer=Math.min(answer, sum);
            return;
        } else {
            for(int i = start; i < pzCnt; i++) { //0~5개 숫자중 4개를 뽑는 로직
                pzCh[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++) {
                int tmp = kb.nextInt();
                if(tmp == 1) {
                    hz.add(new Point(i, j));
                }
                if(tmp == 2) {
                    pz.add(new Point(i, j));
                }
            }
        pzCnt = pz.size();
        pzCh = new int[m];

        T.DFS(0, 0);
        System.out.println(answer);

    }
}
