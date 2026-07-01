package DSA.Arrays;

import java.util.HashMap;

public class FirstRepeating {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 3, 4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }

        System.out.println("No repeating element");
    }
    public int optimalSoln(int[] arr) {

    HashMap<Integer, Integer> freq = new HashMap<>();

    // Store frequencies
    for (int num : arr) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    // Find first repeating element
    for (int num : arr) {
        if (freq.get(num) > 1) {
            return num;
        }
    }

    return -1; // No repeating element
}
}