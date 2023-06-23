정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
입출력 예
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]

문제가 좀 이해 안가도록 나온거 같다... 정렬을 해야 할것 같았는데 정렬하는게 아닌 진짜 작은 것만 빼서 리턴이다
{-1, 4, 2, 3} -> {4, 2, 3}

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        if(arr.length == 1) {
            return new int[] {-1};
        }

        int minInx = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                minInx = i;
                min = arr[i];
            }
        }

        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i != minInx) {
                answer[cnt++] = arr[i];
            }
        }

        return answer;
    }
