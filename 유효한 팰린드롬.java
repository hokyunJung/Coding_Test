import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        
        StringBuilder sb = new StringBuilder();
        
        for (char x : str.toCharArray()) {
            if(Character.isAlphabetic(x)) sb.append(x);
        }

        String a = sb.toString();
        String b = sb.reverse().toString();

        if(a.equalsIgnoreCase(b)) System.out.println("YES");
        else System.out.println("NO");

        
    }
}
