문자 찾기
한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개
존재하는지 알아내는 프로그램을 작성하세요. 대소문자를 구분하지 않습니다.
문자열의 길이는 100을 넘지 않습니다.
▣ 입력설명
첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
문자열은 영어 알파벳으로만 구성되어 있습니다.
▣ 출력설명
첫 줄에 해당 문자의 개수를 출력한다.
▣ 입력예제 1
Computercooler
c
▣ 출력예제 1
2

import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        String c = kb.nextLine();
        c = c.toLowerCase();

        int sum = 0;
        for(char ch : str.toLowerCase().toCharArray()) {
            if(c.equals(Character.toString(ch))) sum+=1;
        }
        System.out.println(sum);
    }
}
