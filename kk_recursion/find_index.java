package DSA.kk_recursion;

import java.util.ArrayList;

public class find_index {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 9, 9, 18 };
        int target = 9;
        int index = 0;
        findAllIndex(arr, target, index);
        System.out.println(list);

    }

    static int finder(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return finder(arr, target, index + 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<Integer>();

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(target);
        }
        findAllIndex(arr, target, index + 1);

    }
}
