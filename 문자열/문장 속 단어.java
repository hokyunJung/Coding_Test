import java.util.*;

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine(); //한 줄을 읽어야 한다.. next() it is time -> it 만 읽힘.

        String[] strs = str.split(" ");

        int maxLenght = 0;
        int maxIdx = 0;
        for(int i = 0; i < strs.length; i++) {
            if(strs[i].length() > maxLenght) {
                maxIdx = i;
            }
        }

        System.out.println(strs[maxIdx]);
    }
}
