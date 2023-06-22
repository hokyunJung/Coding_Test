최대 길이 연속부분수열
0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변
경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의
연속부분수열을 찾는 프로그램을 작성하세요.
만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
1 1 0 0 1 1 0 1 1 0 1 1 0 1
여러분이 만들 수 있는 1이 연속된 연속부분수열은 1 1 0 0 1 1 1 1 1 1 1 1 0 1 이며 그
길이는 8입니다.
▣ 입력설명
첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.
▣ 출력설명
첫 줄에 최대 길이를 출력하세요.
▣ 입력예제 1
14 2
1 1 0 0 1 1 0 1 1 0 1 1 0 1
▣ 출력예제 1
8


import java.util.*;

class Main {

	//rt 0을 만나면 1로 바꿨다고 생각하고
	//lt 가 0을 만나면 1로 바꿨던걸 0으로 바꾼다 생각
	
	//1 1 0 0 1 1 0 1 1 0 1 1 0 1

	//cnt는 rt가 우측으로 가면서 0 -> 1로 변경한 횟수
	//cnt > k cnt가 k보다 크면 lt가 따라가면서 1을 0으로 바꾼다 생각
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
