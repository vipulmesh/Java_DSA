package DSA.Strings;

public class permutations_in_strings {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        // chk s1 chars present in s2 or not
        if (s1.length() > s2.length()) {
            System.out.println("not possible");
        }

        // s1 ka freq table
        int count1[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = ch - 'a';
            count1[index]++;
        }
        // s2 ke liye for first window
        int i = 0;
        int windowLenght = s1.length();
        int count2[] = new int[26];
        // first window ka freq table
        for (i = 0; i < windowLenght; i++) {
            char ch = s2.charAt(i);
            int index = ch - 'a';
            count2[index]++;

        }
        if (compareFreq(count1, count2) == true) {
            System.out.println("TRUE");
        } else {
            // both the freq tables are not matching
            // process reaminig windows
            while (i < s2.length()) {
                // new windows par mve kar rhe ho toh new char kon freq table me addkrow
                char newChar = s2.charAt(i);
                int newCharIndex = newChar - 'a';
                count2[newCharIndex]++;
                // old char ki entry ko remove karna hia
                int oldCharIndex = i - windowLenght;
                char oldChar = s2.charAt(oldCharIndex);
                int freqTableOfOldChar = oldChar - 'a';
                count2[freqTableOfOldChar]--;
                // apke pass updated table aagya hai window ke liye
                // compare krow s1 k refernce table se
                if (compareFreq(count1, count2) == true) {
                    System.out.println("true");
                }
                i++;

            }
        }
        
    }

    static boolean compareFreq(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
}