package DSA.Arrays;

public class pivot_index {
    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        int  n = arr.length;
        int leftSum[]= new int[n];
        int rightSum[]= new int[n];

        //fill left sum array
        leftSum[0]=arr[0];
        for(int i=1; i<n; i++){
            leftSum[i]=leftSum[i-1]+arr[i];
        }
        //rightsum array
        rightSum[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightSum[i]=rightSum[i+1]+arr[i];

        }

        //chk for the equality

        for(int i=0; i<n; i++){
            if(leftSum[i]==rightSum[i]){
                System.out.println("pivot index is "+i);
            }

        }
        

        

    }
}
