package DSA.kk_recursion;

public class all_subsets{
    public static void main(String[] args) {
        subset("abc", "");
        
    }
    static void subset(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch =up.charAt(0);
        subset(p+ch, up.substring(1));
        subset(p, up.substring(1));
    }
}