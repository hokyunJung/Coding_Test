import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        ArrayList<String> strs = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(kb.next());
            strs.add(sb.reverse().toString());
        }

        for (String s : strs) System.out.println(s);
    }
}
