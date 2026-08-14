package DSA.kk_recursion;

public class palindrome {

    static int sum = 0;

    static void reverse(int num) {
        if (num == 0) {
            return;
        }

        int rem = num % 10;
        sum = sum * 10 + rem;

        reverse(num / 10);
    }

    static boolean palin(int num) {
        sum = 0;              // reset before reversing
        reverse(num);

        return num == sum;
    }

    public static void main(String[] args) {

        System.out.println(palin(121));   // true
        System.out.println(palin(123));   // false
        System.out.println(palin(1221));  // true
    }
}