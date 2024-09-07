package Recursion;

public class Count {

    static int count(int n){
        if (n == 0){
            return n;
        }

       // return count(n/10) + 1;
        int smallAns = count(n/10);
        int ans = smallAns + 1;
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(count(243142757));
    }
}
