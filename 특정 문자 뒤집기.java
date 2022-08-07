import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        char[] strs = str.toCharArray();
        char[] copyStrs = new char[strs.length];
        for (int i = 0; i< strs.length; i++) {
            if(Character.isAlphabetic(strs[i])) { //Character.isAlphabetic 알파벳인가?
                copyStrs[(strs.length -1) - i] = strs[i];
            } else {
                copyStrs[i] = strs[i];
            }
        }

        System.out.println(new String(copyStrs));
    }
}
