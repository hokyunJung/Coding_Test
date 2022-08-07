import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        for(char x : str.toCharArray()) {
            if (Character.isUpperCase(x)) System.out.print(Character.toLowerCase(x));
            else System.out.print(Character.toUpperCase(x));
        }
    }
}
