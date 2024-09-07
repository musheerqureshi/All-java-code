package Recursion;

public class SumOFDigit {

    static int Sum(int n ){
        // base case
        if (n >= 0 && n <= 9){
            return n;
        }
        // recursive work --> small ans
        int smallAns = Sum(n/10);

        // self work
        int ans = smallAns + (n%10);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Sum(12345));
    }
}
