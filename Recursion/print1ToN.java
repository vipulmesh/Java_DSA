package DSA.Recursion;

public class print1ToN {
    public static void main(String[] args) {
        int n = 5;
        solution(n, 1);
    }

    static void solution(int n, int count) {
        // Base Case
        if (count > n) {
            return;
        }

        // Recursive Call
        solution(n, count + 1);

        // Processing
        System.out.println(count);
    }
}