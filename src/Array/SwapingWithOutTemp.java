package Array;

public class SwapingWithOutTemp {
    static void swap(int a, int b){
        System.out.println("Original value of swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values of after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        swap(a, b);
    }

}
