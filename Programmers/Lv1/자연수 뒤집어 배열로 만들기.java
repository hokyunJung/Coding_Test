문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]

class Solution {
    public int[] solution(long n) {
        String sn = ""+n;
		int[] answer = new int[sn.length()];
        
        int aIdx = 0;
        for (int i = sn.length() - 1; i >= 0; i--) {
            answer[aIdx++] = Integer.parseInt("" + sn.charAt(i));
        }
        
        return answer;
    }
}

다른 좋은예
return new StringBuilder().append(n).reverse().chars().map(m -> Character.getNumericValue(m)).toArray();
return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
