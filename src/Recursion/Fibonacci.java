package Recursion;

public class Fibonacci {

    static int  fibo(int n ){
        // base case
        if(n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }

        /**
        // recursive work
        int prev = fibo(n-1);
        int prevPrev = fibo(n-2);

        // self work
      /**  int ans = prev + prevPrev;
        return ans;

      return prev + prevPrev;
      **/

        return fibo(n-1) + fibo(n-2);

    }

    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
}
