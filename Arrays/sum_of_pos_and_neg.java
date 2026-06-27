package DSA.Arrays;

public class sum_of_pos_and_neg {
    public static void main(String[] args) {
        int [] arr = {2,-8,-6,4,-2};
        int pos_sum =0;
        int neg_sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                pos_sum = pos_sum + arr[i];
            }else{
                neg_sum = neg_sum + arr[i];
            }
        }
        System.out.println("sum of positive numbers is: "+pos_sum);
        System.out.println("sum of negative numbers is: "+neg_sum);
    }
}

