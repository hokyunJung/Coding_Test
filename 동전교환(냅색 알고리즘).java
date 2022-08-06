import java.util.*;

//DFS 로 풀면 n이 많을때 너무많이 stack이 쌓여서 안된다.. DP로 풀어야함...
//dp[15] 를 만들어 [0, M, M, M, ... M, M]
//규칙을 찾아야 하는데...
//i=0, j=coin[i], dp[j-coin[i]] + 1 해당 금액의 동전개수.. 동전개수가 기존 갯수보다 최소면 dp변경..
//i = 0 [0, 1, 2, 3, 4, 5, 6, 7, 8....
//i = 2 [0, 1, 1, 2, 2, 3, 3, 4, 4....
//i = 3 [0, 1, 1, 2, 2, 1, 2, 2, 3....
class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int [] coin = new int[n];
        
        for (int i = 0; i < n; i++) {
            coin[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int [] dp = new int[m+1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < n ; i++) {
            for(int j = coin[i]; j <= m; j++) {
                int v = dp[j - coin[i]];
                if (dp[j] > v) {
                    dp[j] = v + 1;
                }
            }
        }

        System.out.print(dp[m]);
    }
}
