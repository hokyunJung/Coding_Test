모든 아나그램 찾기(해쉬, 투포인터, 슬라이딩 윈도우)
S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하
세요. 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
▣ 입력설명
첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
▣ 출력설명
S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
▣ 입력예제 1
bacaAacba
abc
▣ 출력예제 1
3
출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
▣ 입력예제 2
bacaAacbaa
abca
▣ 출력예제 2
3

import java.util.*;

class Main {


	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		String s = kb.next();
		String t = kb.next();
		int sSize = s.length();
		int tSize = t.length();
		char[] arr = s.toCharArray();

		HashMap<Character, Integer> tMap = new HashMap<>();
		HashMap<Character, Integer> sMap = new HashMap<>();
		for (char c : t.toCharArray()) tMap.put(c, tMap.getOrDefault(c, 0) + 1);
		for (int i = 0; i < tSize - 1; i++) sMap.put(arr[i], sMap.getOrDefault(arr[i], 0) + 1);
		
		int answer = 0;
		int lt = 0;
		for (int rt = tSize - 1; rt < sSize; rt++) {
			sMap.put(arr[rt], sMap.getOrDefault(arr[rt], 0) + 1);
			if(tMap.equals(sMap)) answer++;
			sMap.put(arr[lt], sMap.getOrDefault(arr[lt], 0) - 1);
			if(sMap.get(arr[lt]) == 0) sMap.remove(arr[lt]);
			lt++;
		}
		System.out.println(answer);


		System.out.println(new StringBuilder().append('b').append('a').append('c').chars().sorted().toString());
	}
}

