package DSA.Recursion;

public class powerof2 {
    public static void main(String[] args) {
        int power =6;
        System.out.println(powerfunc(power));
    }
    public static int powerfunc(int power){
        if (power ==0) {
            return 1;
        }
        return 2*powerfunc(power-1);
    }
}
