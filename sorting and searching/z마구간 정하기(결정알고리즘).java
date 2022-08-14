import java.util.*;

class Main {

    public int isPosible(int mid, int[] arr) {
        int cnt = 1;
        int ep = 0; //말을 둔 거리

        for (int i = 1; i < arr.length; i++) { //무조건 첫번재 말을 뒀다고 생각하고...
            if(arr[i] - ep >= mid) {
                cnt++;
                ep = arr[i];
            } 
        }

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
        
        int lt = arr[0], rt = arr[n-1], minDis = 0;
        //lt 와 rt를 거리의 기준으로 봐야한다..
        while(lt <= rt) {
            int mid = 0;
            mid = (lt + rt) / 2; //5
            
            int p = T.isPosible(mid, arr); // 배치 될 수 있는 마리수 리턴
            if(p >= m) { // 말을 둘수 있는 경우가 m보다 큰 경우 5거리보다 낮게 잡는다.
                lt = mid + 1;
                minDis = mid;
            } else {
                rt = mid - 1;
            }
        }
        
        System.out.println(minDis);
    }
}
