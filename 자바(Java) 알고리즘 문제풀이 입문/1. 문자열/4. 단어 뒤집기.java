단어 뒤집기
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
▣ 입력설명
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되
어 있습니다.
▣ 출력설명
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
▣ 입력예제 1
3
good
Time
Big
▣ 출력예제 1
doog
emiT
giB

import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        ArrayList<String> strs = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(kb.next());
            strs.add(sb.reverse().toString());
        }

        for (String s : strs) System.out.println(s);
    }
}
