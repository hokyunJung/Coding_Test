import java.util.*;

class Exam {
    int v;
    int t;
    Exam(int v, int t) {
        this.v = v;
        this.t = t;
    }
}

class Main {
    static ArrayList<Exam> exams;
    static int n;
    static int m;
    static int max = Integer.MIN_VALUE;

    public void solution(int L, int sumV, int sumT) {
        //종료 조건 -> 마지막까지 탐색했다.
        if (L == n) {
            if(sumT <= m) {
                max = Math.max(max, sumV);
            }
            return;
        } else {
            //이미 시간이 초과된다면..종료
            if (sumT > m) {
                return;
            }
            solution(L + 1, sumV + exams.get(L).v, sumT + exams.get(L).t); // 푼다
            solution(L + 1, sumV , sumT); //풀지 않는다.
        }
    }
    
    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        //문제의 개수 n
        n = kb.nextInt();
        exams = new ArrayList<Exam>(n);
        //제한시간 m
        m = kb.nextInt();
        
        //입력 받기
        for (int i = 0; i < n; i++)  {
            exams.add(new Exam(kb.nextInt(), kb.nextInt()));
        }

        T.solution(0, 0 ,0);

        System.out.println(max);
    }
}
