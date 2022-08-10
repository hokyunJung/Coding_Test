import java.util.*;

class Main {


	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		String strA = kb.next();
		String strB = kb.next();

		HashMap<Character, Integer> mapA = new HashMap<>();
		HashMap<Character, Integer> mapB = new HashMap<>();

		for(char x : strA.toCharArray()) mapA.put(x, mapA.getOrDefault(x, 0)+1);
		for(char x : strB.toCharArray()) mapB.put(x, mapB.getOrDefault(x, 0)+1);

		if(mapA.equals(mapB)) System.out.print("YES");
		else System.out.print("NO");
	}
}

