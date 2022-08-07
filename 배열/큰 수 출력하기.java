import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i < n+1; i++) arr[i] = kb.nextInt();

        for (int i = 1; i < n+1; i++) if(arr[i - 1] < arr[i]) System.out.print(arr[i] + " ");
    }
}
