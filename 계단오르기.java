import java.util.*;

// 1계단 방법 1
// 2계단 1계단 방법 1 + 1
// 3계단 1계단 방법 1 + 2계단 방법 2
// 4계단 2계단 방법 2 + 3계단 방법 3 = 5

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        int[] dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        System.out.println(dp[n]);

    }
}
