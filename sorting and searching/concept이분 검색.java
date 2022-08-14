/*
개념 문제이다..
이분검색(binary search)는 무조건 정렬된 상태에서 진행...
lt                   rt
12 23 32 57 65 81 87 99
0   1  2  3  4  5  6  7
mid = (lt + rt) / 2 -> 중간 인덱스를 찾아서 중간 인덱스 값이 찾고자 하는 값보다
같음 -> 찾은거.
  크면 -> rt = mid + 1;
작으면 -> lt = mid - 1;

*/
import java.util.*;

class Main {

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

        int lt = 0, rt = arr.length - 1;
        while(true) {
            int mid = 0;
            mid = (lt + rt) / 2;
            if(arr[mid] == m) {
                System.out.println(mid + 1);
                break;
            }
            if(m < arr[mid]) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        

    }
}
