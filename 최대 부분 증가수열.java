import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        int[] dp = new int[n];
        int[] arr = new int[n];

        for (int i = 0 ; i < n ; i++) {
            arr[i] = kb.nextInt();
        }

        dp[0] = 1;

        int answer = 0;
        for (int i = 0 ; i < n ; i++) {
            int max = 0;
            for (int j = i - 1 ; j >= 0 ; j--) {
                if(arr[j] < arr[i] && dp[j] > max) {
                    max = dp[j];
                    // 5 3 7 8 6 2 9 4
                    // dp[3]은 7 < 8 니까 dp[2] 결과값을 포함한다. 또한 dp[1] dp[0]의 경우 수도 포함 한다.
                    // dp[3]은 dp 0~2의 값중 큰걸 골르면 된다.
                }
            }
            dp[i] = max + 1;
            answer = Math.max(answer, dp[i]);
        }

        System.out.println(answer);
    }
}
