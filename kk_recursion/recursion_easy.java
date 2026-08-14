package DSA.kk_recursion;

public class recursion_easy {
    public static void main(String[] args) {
        // int num =5;
        int num = 3094;
        System.out.println(digitsum(num));

        // System.out.println(sum(num));
    }

    static int recur(int num) {
        if (num <= 1) {
            return 1;
        }
        int ans = num * recur(num - 1);
        return ans;

    }

    static int sum(int num) {
        if (num == 0) {
            return 0;

        }
        int ans = num + sum(num - 1);
        return ans;
    }

    static int digitsum(int num) {
        if (num / 10 == 0) {
            return 0;
        }
        int ans = num % 10 + digitsum(num / 10);
        return ans;
    }
}
