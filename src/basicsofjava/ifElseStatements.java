package basicsofjava;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ifElseStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
        int age = sc.nextInt();

        if (age > 18){
            System.out.println("Adult");
        }else {
            System.out.println("Adult");
        }
         **/

        /**
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
         **/

        /**
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
                System.out.println("a is greater than b");
            }else{
                System.out.println("a is lesser than b");
            }
         **/



        /**
        int button = sc.nextInt();

        if (button == 1){
            System.out.println("Hii");
        } else if (button == 2){
            System.out.println("Hy");
        } else if (button == 3){
            System.out.println("Hello");
        } else {
            System.out.println("Invalid Button");
        }
         **/

        // switch break statements

        int Button = sc.nextInt();
        switch (Button){
            case 1 : System.out.println("Hii");
            break;

            case 2 : System.out.println("Hy");
            break;

            case 3 : System.out.println("Hello");
            break;

            default: System.out.println("Invalid Button");
        }



    }
}
