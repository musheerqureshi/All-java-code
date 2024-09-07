package Recursion;

import java.util.Scanner;

public class Palidrome {

    static boolean palidrome(String s, int l, int r){
        if (l >= r){
            return true;
        }
        return (s.charAt(l) == s.charAt(r) && palidrome(s, l+1, r-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(palidrome(s, 0, s.length()-1));
    }
}
