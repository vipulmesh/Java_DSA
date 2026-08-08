package DSA.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class subsequences {

    public List<String> powerSet(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        getAllSubsequences(s, 0, output, ans);

        Collections.sort(ans);
        return ans;
    }

    static void getAllSubsequences(String s, int index, StringBuilder output, List<String> ans) {

        // Base case
        if (index >= s.length()) {
            ans.add(output.toString());
            return;
        }

        char ch = s.charAt(index);

        // Include
        output.append(ch);
        getAllSubsequences(s, index + 1, output, ans);

        // Backtrack
        output.deleteCharAt(output.length() - 1);

        // Exclude
        getAllSubsequences(s, index + 1, output, ans);
    }

    public static void main(String[] args) {

        String s = "abc";

        subsequences obj = new subsequences();

        List<String> result = obj.powerSet(s);

        System.out.println(result);
    }
}