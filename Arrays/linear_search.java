package DSA.Arrays;

public class linear_search {
    public static void main(String[] args) {

        int input_value = 3;
        int[] arr = {2, 4, 3, 3};

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input_value) {
                System.out.println("Present at index: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }
}