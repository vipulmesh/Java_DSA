package DSA.Recursion;

public class print_digits {
    static void print(int n) {
        if (n == 0) {
            return;
        }
        int digit = n % 10;
        n = n / 10;

        // recursive reln
        print(n);
        System.out.println(digit);

    }

    public static void main(String[] args) {
        int n = 1292;
        print(n);
    }
}
