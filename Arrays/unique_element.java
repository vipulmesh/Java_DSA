package DSA.Arrays;

class unique_element {
public static void main(String[] args) {
    int[] arr = {2, 3, 4, 2, 3};
//1st approach using nested for loops

    //iterate over every element 
    for(int i=0; i<arr.length; i++){
        //initialzie count to 0   
        int count=0;
        for(int j=0; j<arr.length;j++){
            //count the freq
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if(count==1){
            System.out.println(arr[i]);
        }
    }


    //2nd approch using XOR 
//     T0T0 T(0)
//     T0F1 F(1)
//     F1T0 F(1)
//     F1F1 T(0)
//   num xor num == 0

// mujhe nahi sikhna yeh bkchod method 
}
    
}