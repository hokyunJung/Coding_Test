import java.util.*;

class Main {
//풀긴 풀었는데.. 2시간이나 걸림..ㅜㅜ
    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        
        int[] arr = new int[n];

        for (int i = 0; i < k; i++) {
            int id = kb.nextInt();
            int idx = 0;
            for(int j = 0; j < n; j++) {
                if(arr[j] == id) {
                    idx = j;
                }
            }

            if(idx != 0) {
                for (int j = idx; j > 0; j--) {
                    arr[j] = arr[j-1];
                }
                arr[0] = id;
            } else {
                for (int j = n-1; j > 0; j--) {
                    arr[j] = arr[j-1];
                }
                arr[0] = id;
            }
            
            for(int x : arr) System.out.print(x+ " ");
        }


    }
}
