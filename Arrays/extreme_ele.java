package DSA.Arrays;

public class extreme_ele {
    public static void main(String[] args) {
        int [] arr ={7,6,2,9,1,6,5};
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
