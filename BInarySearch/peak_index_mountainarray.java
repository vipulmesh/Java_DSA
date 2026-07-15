package DSA.BInarySearch;

public class peak_index_mountainarray {
    public static void main(String[] args) {
        int [] arr ={0,2,5,3,1};
        int n =arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;

        while(s<=e){
            int mid =s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                //main ascneding order wale part me hun
                //iska matlb me left me hun
                //or  mujhe pta hai right part me answer hao
                s=mid+1;

            }
            else{
                //arr[mid]>=arr[mid+1]
                //iska matlb main right part me hun
                // iska mtlb mai ek poteneitla solutin pe hun
                ans =mid;
                //now i have to find the final soln
                //mujhe pta hia right partt descending order wala hia toh answer pakka left me hi milega 
                e=mid-1;

            }

        }
        System.out.println("peak index is "+ans);
    }
}
