package Recursion;

public class seriesSum {

    static int Sum(int n){
        if(n == 0){
            return n;
        }
        // System.out.println(n);
        int smallAns = Sum(n-1);
        // int ans = n + smallAns;
        return  n + smallAns;
    }

    public static void main(String[] args) {
        System.out.println(Sum(5));
    }
}
