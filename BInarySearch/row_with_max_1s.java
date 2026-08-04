package DSA.BInarySearch;

public class row_with_max_1s {
    static int get1stOccurrence(int arr[][], int rowIndex) {
        int totalCol = arr[0].length;
        
        int ans = -1;
        // handeling case wheere there is no one inside the row
        // IF MAIN RIGHT MOST ELE IS ZERO MEANS 1 HAI HI NAHI
        if (arr[rowIndex][totalCol - 1] == 0) {
            return totalCol;
        } else {
            int s = 0;
            int e = totalCol - 1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[rowIndex][mid] == 0) {
                    s = mid + 1;
                } else {
                    ans = mid;
                    e = mid - 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
int[][] arr = {
    {0,1,1,1,1},
    {0,0,1,1,1},
    {1,1,1,1,1},
    {0,0,0,0,0}
};        int totalRow=arr.length;
        int totalCol=arr[0].length;
        int maxi=-1;
        int maxOneWaliRowINdex=-1;
        //move to each row
        //find the 1st occurence 
        //using funcnof first occurence calculate the count of 1's
        for(int row=0; row<totalRow; row++){
            //for each row find F.O
            int firstOccrIndex=get1stOccurrence(arr, row);
            //calculate number of 1s
            int oneCount =totalCol-firstOccrIndex;
            if(oneCount!=0 && oneCount>maxi){
                //ho skta hai yehi row ans ho
                maxi=oneCount;
                maxOneWaliRowINdex=row;
            }
        }
        System.out.println(maxOneWaliRowINdex);
    }
}
