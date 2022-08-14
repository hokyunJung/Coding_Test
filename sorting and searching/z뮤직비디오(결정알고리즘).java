import java.util.*;

class Main {

    public int isPosible(int mid, int[] arr) {
        int cnt = 0;
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(sum + arr[i] <= mid) {
                sum+=arr[i];
            } else {
                sum = arr[i];
                cnt++;
            }
        }
        cnt++;

        return cnt;
    }

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        Arrays.sort(arr);
        
        int lt = Arrays.stream(arr).max().getAsInt(), rt = Arrays.stream(arr).sum(), answer = 0;
        while(lt <= rt) {
            int mid = 0;
            mid = (lt + rt) / 2;
            
            int p = T.isPosible(mid, arr);
            if(p <= m) {
                rt = mid - 1;
                answer = mid;
            } else {
                lt = mid + 1;
            }
        }
        
        System.out.println(answer);
    }
}
