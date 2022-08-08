import java.util.*;

class Main {
	public static void main(String[] args) {
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		int[] arr = new int[n+1];

    //           arr 2 3 4 5 6 7 8 9 10 11 12
    //               0 0 0 0 0 0 0 0 0 0 0 0 
    //2 4 6 8 -> arr 1 0 1 0 1 0 1 0 1 0 0 1 
    //3 6 9 12-> arr 1 1 1 0 1 0 1 1 1 0 0 1
    //4 8 12 16->arr 1 1 1 0 1 0 1 1 1 0 0 1
    
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if(arr[i] == 0) {
				sum++;
				for(int j = i; j <= n; j=j+i) { 
					arr[j] = 1;
				}
			}
		}

		System.out.println(sum);
	}
}
