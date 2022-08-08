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
