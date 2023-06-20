문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
입출력 예
n	return
118372	873211

public long solution(long n) {
        long answer = 0;

        String sn = ""+n;
        List<Character> arr = new ArrayList<>();
        for(int i = 0; i < sn.length(); i++) {
            arr.add(sn.charAt(i));
        }
        arr.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for(char c : arr) {
            sb.append(c);
        }
        answer = Long.parseLong(sb.toString());

        return answer;
    }


public class ReverseInt {
    String res = "";
    public int reverseInt(int n){
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
