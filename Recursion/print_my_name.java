package DSA.Recursion;

public class print_my_name {
   static public void printName(int n){
    if(n==0){
        return;
    }
    System.out.println("Vipul Meshram");
    printName(n-1);
   } 
   public static void main(String[] args) {
    int n=5;
    printName(n);
   }
}
