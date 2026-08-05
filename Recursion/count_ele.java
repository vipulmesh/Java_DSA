package DSA.Recursion;

public class count_ele {
    static void count(int arr[], int i, int target,int countnum){
        
        if(i>=arr.length){
            System.out.println(countnum);
            return;
        }
        if(target==arr[i]){
            countnum++;
        }
        count(arr, i+1, target, countnum);
        
    }
    public static void main(String[] args) {
        int [] arr = {10,10,20,20,23,21,43,21,10};
        int target =10;
        int i=0;
        int countnum=0;
        count(arr, i, target, countnum);
    }
}
