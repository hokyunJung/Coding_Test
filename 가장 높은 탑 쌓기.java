import java.util.*;

class Brick implements Comparable<Brick> {
    int a;
    int b;
    int c;
    Brick(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public int compareTo(Brick o) {
        return o.a - this.a;
    }
}

class Main {
//DP 의 가장 핵심은...
//dp[4]의 값을 구할때, dp[0] dp[1] dp[2]의 값을 탐색하면서 가장 큰 값을 골라서
//dp[4] = 이전에 가장 큰 값 dp[2] + 벽돌 높이값(조건개수?) 이렇게 구하는 것.
  
    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);
        ArrayList<Brick> arr = new ArrayList<Brick>();
        int n = kb.nextInt();
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            arr.add(new Brick(kb.nextInt(), kb.nextInt(), kb.nextInt()));
        }

        Collections.sort(arr);

        int answer = 0;
        dp[0] = arr.get(0).b;
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = i -1 ; j >= 0; j--) {
                if (arr.get(j).c > arr.get(i).c && dp[j] > max) {
                    max = dp[j];
                }
            }
            dp[i] = max + arr.get(i).b;
        }
        for (int i : dp) {
            answer = Math.max(answer, i);
        }
        
        System.out.println(answer);
    }
}
