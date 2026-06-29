package DSA.Arrays;

public class extreme_ele {
    public static void main(String[] args) {
        int [] arr ={2,3,4,5,6,7};
        int i=0;
        int j= arr.length-1;
        while(i<=j){
           if(i==j){
            System.out.println(arr[j]);
            return;
           }
           else{
            //i<j
            System.out.println(arr[i]);
            i++;
            System.out.println(arr[j]);
            j--;
           }

        }


    }
}
