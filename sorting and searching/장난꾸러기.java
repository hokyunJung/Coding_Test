import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        
        int[] arr = new int[n];
        int[] copyArr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        copyArr = arr.clone();

        Arrays.sort(arr);
        for(int i = 0; i < n-1; i++) {
            if(arr[i] != copyArr[i]) {
                System.out.print((i + 1) + " ");
            }
        }
        

    }
}
