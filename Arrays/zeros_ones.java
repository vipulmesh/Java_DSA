package DSA.Arrays;

public class zeros_ones {
    public static void main(String[] args) {
                int [] arr = {0,-8,1,1,0};
        int zeros =0;
        int ones=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zeros=zeros+1;
            }
            if(arr[i]==1){
                ones=ones+1;     
        }
      
    }
      System.out.println("count of zeros: " + zeros);
        System.out.println("count of ones: "+ones);
}
}
