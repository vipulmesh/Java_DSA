package DSA.BInarySearch;

public class pivotIndexOfRotatedArray {
    public static void main(String[] args) {
       int [] arr ={0,2,5,3,1};
        int n =arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;  

        if(arr[s]<=arr[e]){
            //no rotation 
            System.out.println("-1");
        }
        while(s <= e){
            int mid =s+(e-s)/2;
            if(arr[mid]<arr[n-1]){
                //iska matlb hum l2 wali par hia
                // answer to l1 wali line par hai
                e=mid-1;

            }
            else{
                //midn mera l1 pe hai
                //ans store krwado
                ans=mid;
                //move to right 
                s=mid+1;
            }
        }
        System.out.println(ans);
    }
}
