N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하
는 프로그램을 작성하세요. 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출
력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다. 첫 자리부터의 연속된 0은 무시한다.
▣ 입력설명
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
각 자연수의 크기는 100,000를 넘지 않는다.
▣ 출력설명
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
▣ 입력예제 1
9
32 55 62 20 250 370 200 30 100
▣ 출력예제 1
23 2 73 2 3

import java.util.*;

class Main {
	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		String[] inputs = new String[n];
		for (int i = 0; i < n; i++) {
			inputs[i] = kb.next();
		}
		
		// 숫자 뒤집는 방법 다른거...
		/*
		int tmp = 243;
		int res = 0;
		while(tmp>0){
			int t=tmp%10;
			res=res*10+t; -> 0*10+3, 3*10+4, 34*10+2
			tmp=tmp/10;
		}
		*/

		for (String s : inputs) {
			StringBuilder sb = new StringBuilder(s);
			int v = Integer.parseInt(sb.reverse().toString());
			if(v == 1) continue;
			boolean isSosu = true;
			for (int i = 2; i < v; i++) {
        //숫자가 2부터 자기 숫자 전까지 나누어 떨어진다면 소수가 아니다.
				if(v % i == 0) {
					isSosu = false;
					break;
				}
			}
			if(isSosu) System.out.print(v+" ");
		}
	}
}
