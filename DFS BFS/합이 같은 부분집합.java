import java.util.*;

class Main {
    static int n;
    static int mid;
    boolean isFind = false;
    public void DFS(int L, int sum, int[] arr) {
        if(isFind) return;
        if(mid < sum) return;
        if(L == n) {
            if(sum == mid) {
                System.out.println("YES");
                isFind=true;
            }
        } else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        
        int[] arr = new int[n];

        int sum = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            sum+=arr[i];
        }

        mid = sum/2;
        T.DFS(0, 0, arr);
    }
}
