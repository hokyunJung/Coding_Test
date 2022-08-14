import java.util.*;

class Point implements Comparable<Point> {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

class Main {

    public static void main(String args[]) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        
        ArrayList<Point> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arr.add(new Point(kb.nextInt(), kb.nextInt()));
        }

        Collections.sort(arr);

        for(Point p : arr) {
            System.out.println(p.x + " " + p.y);
        }
        

    }
}
