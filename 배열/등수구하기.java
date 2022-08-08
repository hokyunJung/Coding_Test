import java.util.*;

class Main {
	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		//이중포문
		for (int i = 0; i < n; i++) {
			int cnt = 1;
			for (int j = 0; j < n; j++) {
				if(arr[i] < arr[j]) cnt++;
			}
			System.out.print(cnt + " ");
		}
		
	}
}
