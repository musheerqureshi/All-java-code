package ArrayList;

import java.util.ArrayList;

public class Problems {

    static void reverseList(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {

        /*
         while(i < j)
         int temp = a;
         a = b;
         b = temp;
         */

            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(22);
        list.add(8);
        list.add(5);
        list.add(3);
        System.out.println("Original list " + list);
        reverseList(list);
        System.out.println("Reversed list " + list);
    }
}
