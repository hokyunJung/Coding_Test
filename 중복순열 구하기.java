import java.util.*;

class Main {
    static int[] pm;
    static int n, m;
    public void solution(int L) {
        if (L == m) {
            for(int x : pm) System.out.print(x+" ");
			System.out.println();
            return;
        } else {
            for (int j = 1; j <= n; j++) {
                pm[L] = j;
                solution(L+1);
            }
        }

        
    }

    /* 
L=0            [1, ]            [2, ]               [3, ]
L=1     [1,1] [1,2] [1,3]   [2,1][2,2][2,3]     [3,1][3,2][3,3]
     */
    
    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];

        T.solution(0);

    }
}
