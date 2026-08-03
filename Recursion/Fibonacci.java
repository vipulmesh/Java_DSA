package DSA.Recursion;

public class Fibonacci {

    public static void main(String[] args) {

        int input = 2;
        System.out.println(fibbo(input));

    }

    public static int fibbo(int input) {

        if (input == 0) {
            return 0;
        }

        if (input == 1) {
            return 1;
        }

        return fibbo(input - 1) + fibbo(input - 2);
    }
}