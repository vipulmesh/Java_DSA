package DSA.Recursion;

public class climbing_stairs {
    public static void main(String[] args) {
        int n =8;
        int ans = solution(n);
        System.out.println(ans);
    }
  
    static public int solution(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        int ans = solution(n-1)+solution(n-2);
        return ans;
    }
}
