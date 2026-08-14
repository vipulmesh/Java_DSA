package DSA.kk_recursion;

class rev_number {
    static int sum = 0;

    static void reverse(int num) {
        if (num == 0) {
            return;
        }

        int rem = num % 10;
        sum = sum * 10 + rem;

        reverse(num / 10);
    }

    public static void main(String[] args) {
        reverse(12345);
        System.out.println(sum);
    }
}