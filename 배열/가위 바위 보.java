import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];
        char[] crr = new char[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int i = 0; i < n; i++) brr[i] = kb.nextInt();

        for (int i = 0; i < n; i++) {
            //1 가위 2 바위 3 보 A기준
            if ((arr[i] == 1 && brr[i] == 3) || (arr[i] == 2 && brr[i] == 1) || (arr[i] == 3 && brr[i] == 2)) { //A 이기는 조건
                crr[i] = 'A';
            } else if (arr[i] == brr[i]) { //비기는 조건
                crr[i] = 'D';
            } else {
                //A가 지는 조건
                crr[i] = 'B';
            }
        }

        for (char x : crr) System.out.println(x);
    }
}
