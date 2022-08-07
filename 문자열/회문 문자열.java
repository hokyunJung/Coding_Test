import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        
        StringBuilder sb = new StringBuilder(str);
        String strToReverse = sb.reverse().toString();
        
        if (str.equalsIgnoreCase(strToReverse)) System.out.println("YES");
        else System.out.println("NO");
    }
}
