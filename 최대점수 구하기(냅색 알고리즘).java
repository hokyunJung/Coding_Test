import java.util.*;

class Sol {
    int s;
    int t;
    Sol(int s, int t) {
        this.s = s;
        this.t = t;
    }
}

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] dp = new int[m+1]; //주어진 최대 시간에서...
        ArrayList<Sol> arrs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrs.add(new Sol(kb.nextInt(), kb.nextInt()));
        }
        
        
        for (int i = 0; i < n; i++) {
            int lTime = arrs.get(i).t;
            for (int j = m ; j >= lTime; j-- ) {
                int score = dp[j - lTime] + arrs.get(i).s; 
                //0 1 2 3                  4                  5                   6  7
                //0 0 0 6(3분까지 최대점수) 7(4분까지 최대점수) 10(5분까지 최대점수) 10 13(3분4분 푼거) 16 17 17 21 25 25 25 31 32 35 35 38 41
                // i는 5개의 문제들... j는 최대 시간부터 i문제의 시간까지... dp[j - lTime] + arrs.get(i).s;
                if (score > dp[j]) {
                    dp[j] = score;
                }
            }
        }

        System.out.print(dp[m]);
    }
}
