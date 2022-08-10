import java.util.*;

class Main {


	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();

		int[] b = new int[n];
		for (int i = 0; i < n; i++) b[i] = kb.nextInt();

    //증복을 제거 해야한다...
		TreeSet<Integer> arr = new TreeSet<>(Collections.reverseOrder());
		
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int l = j+1; l < n; l++) {
					arr.add(b[i] + b[j] + b[l]);
				}
			}
		}

		int answer = -1;
		int cnt = 0;
		for (int i : arr) {
			cnt++;
			if(cnt == k) answer = i;
		}
		System.out.println(answer);
	}
}

