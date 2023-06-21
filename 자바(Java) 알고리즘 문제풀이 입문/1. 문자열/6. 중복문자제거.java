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

public String solution(String str){
    String answer="";
    for(int i=0; i<str.length(); i++){
        //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
        if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
ksekkset
            i   indexOf(최초 위치)
        k   0   0
        s   1   1
        e   2   2
        k   3   0 -> i 와 indexOf가 다르므로 최초가 아님
        k   4   0
        s   5   1
        e   6   2
        t   7   7
    }
    return answer;
}