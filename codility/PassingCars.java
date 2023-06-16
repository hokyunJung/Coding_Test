A non-empty array A consisting of N integers is given. The consecutive elements of array A represent consecutive cars on a road.

Array A contains only 0s and/or 1s:

0 represents a car traveling east,
1 represents a car traveling west.
The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.

For example, consider array A such that:

  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A of N integers, returns the number of pairs of passing cars.

The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.

For example, given:

  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
the function should return 5, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer that can have one of the following values: 0, 1.

//문제가 처음 진심 이해가 안갔다....ㅜㅜ
A
index 0  1  2  3  4
값    0  1  0  1  1
index 0에서 보면 우측으로 가면서 1 3 4에서 만난다
index 2에서 보면 우측으로 가면서 3 4에서 만난다.
총5번만난다.


i          0  1  2  3  4
zeroCount  0  1  2  2  2 -> 0의 갯수
meet       0  1  1  3  5 -> 총 만난 갯수

class Solution {
    public int solution(int[] A) {
        int zeroCount = 0;
        long meet = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) zeroCount++;
            else {
                meet += zeroCount;
            }
        }

        return meet > 1000000000 ? -1 : (int) meet;
    }
}
