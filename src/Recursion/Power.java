package Recursion;

public class Power {

    static int pow(int p, int q){  // p^q
        if (q == 0){
            return 1;
        }
        return pow(p, q-1) * p; // p^q-1 * p = p^q

        /**
        int smallAns = pow(p, q-1);

        int ans = smallAns * p;
        return ans;
         **/
    }

    public static void main(String[] args) {
        System.out.println(pow(5, 3));
    }
}
