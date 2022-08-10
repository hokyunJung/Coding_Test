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
	}
}

