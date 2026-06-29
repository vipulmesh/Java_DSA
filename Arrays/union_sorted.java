package DSA.Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class union_sorted {
    public static void main(String[] args) {
        int [] arr1 = {1,1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5,6};

        Set<Integer> set_union = new LinkedHashSet<>();

        for(int i=0; i<arr1.length; i++){
            set_union.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            set_union.add(arr2[i]);
        }
        //printing / iterating over set
        System.out.println(set_union);

        

    }
}
