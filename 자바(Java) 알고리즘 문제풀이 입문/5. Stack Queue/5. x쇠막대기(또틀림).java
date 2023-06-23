▣ 입력설명
한 줄에 쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 공백없이 주어진다. 괄호 문자의
개수는 최대 100,000이다.
▣ 출력설명
잘려진 조각의 총 개수를 나타내는 정수를 한 줄에 출력한다.
▣ 입력예제 1
()(((()())(())()))(())
▣ 출력예제 1
17

import java.util.*;

class Main {

	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		Stack<Character> s = new Stack<>();
		
		int cnt = 0;
		for (int i = 0; i < str.toCharArray().length; i++) {
			if(str.charAt(i) == '(') s.push(str.charAt(i));
			else {
				s.pop();
				//pop 한 걸 가지고 비교 했었어ㅠㅠ if(s.pop() == '(') 문자열의 이전걸 보고 판단해야하는데..
				if(str.charAt(i - 1) == '(') {
					cnt += s.size();
				} else {
					cnt+=1;
				}
			}
		}

		System.out.println(cnt);
	}
}
