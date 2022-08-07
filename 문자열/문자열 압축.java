import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        
        int count = 1;
        char tmp = '!';
        for (char x : str.toCharArray()) {
            if(x != tmp) {
                if (count > 1) System.out.print(count);
                System.out.print(x);
                tmp = x;
                count = 1;
            } else {
                count++;
            }
        }
        System.out.print(count);

    }
}
