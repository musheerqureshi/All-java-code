package Recursion;

public class sumOfAlternativeSign {

    static int Sum(int n){

        if (n == 0){
            return n;
        }

        if(n % 2 == 1){
            return Sum(n-1) + n;
        }
        if (n % 2 == 0){
            return Sum(n-1) - n;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(Sum(5));
    }
}
