This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<A.length; i++) {
            if (A[i] > 0) {
                set.add(A[i]); //set에 먼저 값을 넣고
            }
        }

        for(int i=1; i<Integer.MAX_VALUE; i++) { 1~맥스까지 돌면서 없으면 리턴한다.
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
