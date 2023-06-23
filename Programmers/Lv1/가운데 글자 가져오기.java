문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
s	return
"abcde"	"c"
"qwer"	"we"

import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";

        List<Character> list = new ArrayList<>();
        for(char c : s.toCharArray()) {
            list.add(c);
        }

        int idx = list.size()/2;
        if(list.size() % 2 == 0) {
            answer = "" + list.get(idx - 1) + list.get(idx);
        } else {
            answer = ""+list.get(idx);
        }

        return answer;
    }
}

더 좋은예
s.substring((s.length()-1)/2, s.length()/2 + 1);
