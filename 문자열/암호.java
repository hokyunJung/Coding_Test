import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        
        for (int i = 0; i < str.length(); i = i + 7) {
            int v = Integer.parseInt(str.substring(i, i+7).replaceAll("#", "1").replaceAll("\\*", "0"), 2);
            char tmp = (char) v; 
            System.out.print(tmp);
        }
    }
}
