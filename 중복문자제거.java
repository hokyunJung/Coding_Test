import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        Set<Character> set = new LinkedHashSet<>();
      //Set 중복값 제거됨
      //HashSet 순서 없음
      //TreeSet 순서가 없지만 오름차순 정렬
      //LinkedHashSet 순서 지킴
        
        String str = kb.next();

        for(char x : str.toCharArray()) {
            set.add(x);
        }

        for(char x : set) {
            System.out.print(x);
        }
    }
}
