import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> have = new HashMap<>();

        // Count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            have.put(c, have.getOrDefault(c, 0) + 1);
        }

        // Characters required to form "balloon"
        HashMap<Character, Integer> need = new HashMap<>();
        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2);
        need.put('n', 1);

        int res = Integer.MAX_VALUE;

        // Find the maximum possible balloons
        for (char c : need.keySet()) {
            int fneed = need.get(c);
            int fhave = have.getOrDefault(c, 0);

            int times = fhave / fneed;
            res = Math.min(res, times);
        }

        return res;
    }
}