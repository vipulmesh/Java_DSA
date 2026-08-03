package DSA.Recursion;

public class factorial {
    public static void main(String[] args) {
        int num=3;
        System.out.println(factorial(num));
    
    }
    public static int factorial(int num){
        if ((num==0)) {
            return 1;
        }
        return num*factorial(num-1);
    }
}
