package Test;

public class Test {
    public static void main (String[] args) {
        int s = 0;
        for (int i=1; i<=10; i++) {
            int x = (int) (Math.random() * 100 + 1);
            System.out.println(x);
            if (x % 2 == 0) {
                s += x;
            }

        }

        System.out.println ("s=" + s);
    }
}
