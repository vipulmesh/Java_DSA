package DSA.kk_recursion;

public class countZeros {
    public static void main(String[] args) {
        System.out.println(count(154001210));
    }

    static int count(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int c) {
        if (num == 0) {
            return c;
        }
        int rem = num % 10;
        if (rem == 0) {
            return helper(num / 10, c + 1);
        } else {
            return helper(num / 10, c);
        }

    }
}
