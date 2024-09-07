package basicsofjava;

import java.util.Scanner;

public class Function {

    public static void Musheer(int age){
        System.out.println("Musheer age is " + age);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        Musheer(age);
    }
}
