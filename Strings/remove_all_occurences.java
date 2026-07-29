package DSA.Strings;

public class remove_all_occurences {
    public static void main(String[] args) {
        String s = "ababcab";
        String part ="c";

        while(s.contains(part)){
            int index =s.indexOf(part);
            s = s.substring(0,index)+s.substring(index+part.length());
        }
        System.out.println(s);
    }
}
