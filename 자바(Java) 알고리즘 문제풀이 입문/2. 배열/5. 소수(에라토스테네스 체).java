자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
제한시간은 1초입니다.
▣ 입력설명
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
▣ 출력설명
첫 줄에 소수의 개수를 출력합니다.
▣ 입력예제 1
20
▣ 출력예제 1
8

import java.util.*;

class Main {
	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		int[] arr = new int[n+1];

    //           arr 2 3 4 5 6 7 8 9 10 11 12
    //               0 0 0 0 0 0 0 0 0 0 0 0 
    //2 4 6 8 -> arr 1 0 1 0 1 0 1 0 1 0 0 1 
    //3 6 9 12-> arr 1 1 1 0 1 0 1 1 1 0 0 1
    //4 8 12 16->arr 1 1 1 0 1 0 1 1 1 0 0 1
    
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if(arr[i] == 0) {
				sum++;
				for(int j = i; j <= n; j=j+i) { 
					arr[j] = 1;
				}
			}
		}

		System.out.println(sum);
	}
}
