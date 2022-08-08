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
