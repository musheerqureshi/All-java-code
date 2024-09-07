package learning;

public class GCD {

    static int gcd(int x, int y){
        while (x%y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(gcd(24, 15));
    }

}
