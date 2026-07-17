package DSA.BInarySearch;

public class squareroot{
    public static void main(String[] args) {
        int num =56;
        int s=1;
        int e=num;
        int ans=-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(num==0){
                System.out.println("0");
            }
            if(mid*mid==num){
                System.out.println(mid);
            }
            else if(mid*mid>num){
                    //move to left
                    e=mid-1;
            }
            else{
                //move ot right 
                //ans stoe krwa 
                ans = mid;
                s=mid+1;
            }
        }
        System.out.println(ans);
    
    }

}