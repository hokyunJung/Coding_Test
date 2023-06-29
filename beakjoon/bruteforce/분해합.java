package beakjoon.bruteforce;

import java.io.IOException;

public class 분해합 {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //sol(Integer.parseInt(br.readLine()));
        sol(256);
    }
    
    private static void sol(int N) {
        int result = 0;
        //123,454일경우 생성자+1+2+3+4+5+4 인데 탐색은 i=0부터 말구 N-(N의 사이즈 * 9) 부터 돌면된다.
        for(int i = (N - (String.valueOf(N).length() * 9)); i < N; i++) {
            int num = i;
            int sum = 0;
            //각자리수를 더해준다.
            while(num != 0) {
                sum += num % 10;
                num /= 10;
            }
            //탐색값과 각자리수 더한값이 N하고 같으면 찾은거다.
            if(sum+i == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    } 
}
