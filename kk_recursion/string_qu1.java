package DSA.kk_recursion;

public class string_qu1 {
    public static void main(String[] args) {
        System.out.println(skipapple("baccappleaash"));
    }
    static void skip(String p , String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch=='a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p+ch, up.substring(1));
        }
    }

  static String skipapple(String up){
    if (up.isEmpty()) {
        return "";
    }

    if(up.startsWith("apple")){
        return skipapple(up.substring(1));
    }
    else{
        return up.charAt(0) + skipapple(up.substring(1));
    }
}
}
