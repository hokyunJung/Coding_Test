특정 문자 뒤집기
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기
자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
▣ 입력설명
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
▣ 출력설명
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
▣ 입력예제 1
a#b!GE*T@S
▣ 출력예제 1
S#T!EG*b@a

import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        char[] strs = str.toCharArray();
        char[] copyStrs = new char[strs.length];
        for (int i = 0; i< strs.length; i++) {
            if(Character.isAlphabetic(strs[i])) { //Character.isAlphabetic 알파벳인가?
                copyStrs[(strs.length -1) - i] = strs[i];
            } else {
                copyStrs[i] = strs[i];
            }
        }

        System.out.println(new String(copyStrs));
    }
}
