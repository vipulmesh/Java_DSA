package DSA.BInarySearch;

public class nearly_sorted_array {
    public static void main(String[] args) {
        int [] arr ={10,30,20,50,40};
        int s=0;
        int e=arr.length-1;
        int target=20;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            if(mid+1<arr.length && arr[mid+1]==target){
                System.out.println(arr[mid+1]);
                return;
            } 
            if(mid-1>=0 && arr[mid-1]==target){
                System.out.println(arr[mid-1]);
                return;
            }
            if(target>arr[mid]){
                s=mid+1;
            }
            if(target<arr[mid]){
                e=mid-1;
            }
            

        }
    }
}
