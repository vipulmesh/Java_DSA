package DSA.Arrays;

public class multiply_ele_by_10 {
    public static void main(String[] args) {

         int [] arr = {2,4,3,3};

         int [] new_arr = new int[arr.length];

         for(int i=0; i<arr.length; i++){
            new_arr[i]=arr[i]*10;
         }
         for(int i=0; i<new_arr.length; i++){
            System.out.println(new_arr[i]+"");
            
         }
    }
}
