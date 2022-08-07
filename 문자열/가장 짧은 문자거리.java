import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char t = kb.next().charAt(0);

        for (int i = 0 ; i < str.length(); i++) {
            char c = str.charAt(i);
          //two pointer로 했음..
            int lt = i - 1;
            int rt = i + 1;
            if (c == t) System.out.print(0 + " ");
            else {
                int count = 1;
                while(true) {
                    if ((lt >= 0 && str.charAt(lt) == t) || (rt < str.length() && str.charAt(rt) == t)) {
                        System.out.print(count + " ");
                        break;
                    }
                    lt--;
                    rt++;
                    count++;
                }
            }
            
        }
    }
}
