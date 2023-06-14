A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.

You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.

The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.

For example, you are given integer X = 5 and array A such that:

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.

Write a function:

class Solution { public int solution(int X, int[] A); }

that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.

If the frog is never able to jump to the other side of the river, the function should return −1.

For example, given X = 5 and array A such that:

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
the function should return 6, as explained above.

Write an efficient algorithm for the following assumptions:

N and X are integers within the range [1..100,000];
each element of array A is an integer within the range [1..X].


  // you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//문제를 잘 읽어라... 개구리 -> 강 X까지 건널수 있는 조건은 X까지 나뭇잎이 다 깔리는 시간을 구하는 거다
//위 예제에서 set -> 1 -> 1 3 -> 1 3 4 -> 1 2 3 4 -> 1 2 3 4 5 일때 for의 i 값이 걸리는 시간이다. 
class Solution {
    public int solution(int X, int[] A) {
    Set<Integer> set = new HashSet<>(); //중복값없을때사용
		for (int i = 0; i < A.length; i++) { //시간이 흐른다
			if (set.size() <= X) { //X위치 까지 갈 수 있는 사이즈가 되어야 한다.
				set.add(A[i]); //알아서 중복 없애서 넣는다
			}

			if(set.size() == X) {
				return (i);
			}
		}

        return -1; // 못가면 -1 X=2 A=[2,2,2,2,2,2,2] -> 1이 없으므로 가지 못함 set.size()는 1일꺼임
    }
}
