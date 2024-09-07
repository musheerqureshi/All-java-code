package Recursion;

public class PrintSubsequence {

    // s = "abc" , current ans = " " ;
    // remainingString will be start index 1;


    static void PrintSSQ(String s, String currAns){
        if (s.length() == 0){
            System.out.println(currAns);
            return;
        }

        char curr = s.charAt(0);
        String remString = s.substring(1);
        PrintSSQ(remString, currAns + curr);
        PrintSSQ(remString, currAns);


    }


    public static void main(String[] args) {
        PrintSSQ("abc", " ");
    }
}
