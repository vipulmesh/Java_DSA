package DSA.Strings;

public class adjacent_duplicates {
    public static void main(String[] args) {
        String str = "abbaca";
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ans.length() > 0 && ans.charAt(ans.length() - 1) == ch) {
                ans.deleteCharAt(ans.length() - 1);
            } else {
                ans.append(ch);
            }
        }

        System.out.println(ans.toString());
    }
}
