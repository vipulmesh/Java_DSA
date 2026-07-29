package DSA.Strings;

public class rev_words {

    public static void main(String[] args) {

        String s = "hello vipul";
        StringBuilder ans = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0)
                break;

            int j = i;

            // Find beginning of word
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            // Append current word
            ans.append(s.substring(j + 1, i + 1));

            // Skip spaces before next word
            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }

            // Add space if another word exists
            if (j >= 0) {
                ans.append(' ');
            }

            i = j;
        }

        System.out.println(ans.toString());
    }
}