package DSA.Arrays;

public class first_unsorted_ele {
    public static void main(String[] args) {
        int [] arr = {2,6,7,8,3,9};
        int result=0;
        for(int i =0; i<arr.length-1; i++){
            if(arr[i+1]<=arr[i]){
                result = arr[i+1]; 
                break;
            }
        }
        System.out.println(result);
    }
}
