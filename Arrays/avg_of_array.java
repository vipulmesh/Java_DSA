package DSA.Arrays;

public class avg_of_array {
    public static void main(String[] args) {
        int sum=0;
        int [] arr = {2,4,3,3};
        for(int i =0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("avg is :" + sum/arr.length);

    }
}

//tc -- 0(n)