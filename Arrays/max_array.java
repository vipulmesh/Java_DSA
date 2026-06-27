package DSA.Arrays;
public class max_array {
    public static void main(String[] args) {
        int [] arr = {1,2,4,3,8};
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
           }
        //    max =Math.max(max, arr[i]);
        }
        System.out.println(max);

    }
}
