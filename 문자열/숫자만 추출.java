import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        String answer = "";
        for (char x : str.toCharArray()) if(Character.isDigit(x)) answer+=x; //Character.isDigit(x) 숫자냐?

        System.out.println(Integer.parseInt(answer));
    }
}
