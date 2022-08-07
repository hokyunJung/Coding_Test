import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        String c = kb.nextLine();
        c = c.toLowerCase();

        int sum = 0;
        for(char ch : str.toLowerCase().toCharArray()) {
            if(c.equals(Character.toString(ch))) sum+=1;
        }
        System.out.println(sum);
    }
}
