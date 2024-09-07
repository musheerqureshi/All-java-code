package basicsofjava;


import java.security.AlgorithmParameterGenerator;
import java.util.Scanner;

// add two numbers using method


class Musheer {
    public int sum(int a, int b){
        int ans = a + b;
        return ans;

    }
}

public class Person {
    public static void main(String[] args) {
        Musheer obj = new Musheer();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of input number is ");
        int ans = obj.sum(a, b);
        System.out.println(ans);

    }
}