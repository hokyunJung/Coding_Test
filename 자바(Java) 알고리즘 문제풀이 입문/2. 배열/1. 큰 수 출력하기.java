큰 수 출력하기
N(1<=N<=100)개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작
성하세요.(첫 번째 수는 무조건 출력한다)
▣ 입력설명
첫 줄에 자연수 N이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
▣ 출력설명
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
▣ 입력예제 1
6
7 3 9 5 6 12
▣ 출력예제 1
7 9 6 12

import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i < n+1; i++) arr[i] = kb.nextInt();

        for (int i = 1; i < n+1; i++) if(arr[i - 1] < arr[i]) System.out.print(arr[i] + " ");
    }
}
