import java.util.*;

class Main {


	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		String str = kb.next();

		Map<Character, Integer> map = new HashMap<>();
		for(char x : str.toCharArray()) {
			if(map.containsKey(x)) {
				int v = map.get(x);
				map.replace(x, v+1);
			} else {
				map.put(x, 1);
			}

			//map.put(x, map.getOrDefault(x, 0)+1); 
		}
		
		String answer = "";
		int max = 0;
		for(char x : map.keySet()) {
			if(map.get(x) > max) {
				max = map.get(x);
				answer = x+"";
			}
		}
		System.out.println(answer);
	}
}
