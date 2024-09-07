package String;

import javax.script.ScriptContext;
import java.util.Scanner;

public class stringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);

       /* char ch = s.charAt(8);         //print of index elements
        System.out.println(ch);
        */

       /*
        for (int i = 0; i < s.length(); i++){    // print the elements from loop
            System.out.println(s.charAt(i));
        }   */

     //   System.out.println(s.substring(2, 5));   // print the value for substring  2 index from 4 index

        System.out.println(s.substring(5)); // print the value of index  6, 7, 8, 9 10, 11
    }
}
