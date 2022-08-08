import java.util.*;

class Main {
	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n+1];

		arr[0] = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		int cnt = 0, answer = 0;
		for (int i = 0; i <n; i++) {
			if (arr[i] == 1) {
				cnt++;	
				answer+=cnt;
			} else {
				cnt = 0;
			}	
		}

		System.out.println(answer);
	}
}
