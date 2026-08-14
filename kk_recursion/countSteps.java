package DSA.kk_recursion;

public class countSteps {
    public static void main(String[] args) {

        System.out.println(steps(6541));
    }

    static int steps(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int c) {
        if (num== 0) {
            return c;
        }
        if (num % 10 == 2) {
            return helper(num / 2, c + 1);
        } else {
            return helper(num - 1, c + 1);
        }

    }
}
