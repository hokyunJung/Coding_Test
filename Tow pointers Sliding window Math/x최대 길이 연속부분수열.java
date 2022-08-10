import java.util.*;

class Main {

	//rt 0을 만나면 1로 바꿨다고 생각하고
	//1 1 0 0 1 1 0 1 1 0 1 1 0 1
	//lt 가 0을 만나면 1로 바꿨던걸 0으로 바꾼다 생각
	//rt - lt + 1 -> 1을 카운트 한 개수   
	public int solution(int n, int k, int[] arr){
		int answer=0, cnt=0, lt=0;
		for(int rt=0; rt<n; rt++){
			if(arr[rt]==0) cnt++;
			while(cnt>k){
				if(arr[lt]==0) cnt--;
				lt++;
			}
			answer=Math.max(answer, rt-lt+1);
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

		int answer = T.solution(n, k, arr);

		System.out.println(answer);
	}
}
