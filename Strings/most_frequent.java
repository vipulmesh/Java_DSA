package DSA.Strings;

import java.util.HashMap;
import java.util.HashSet;

public class most_frequent {
    public static void main(String[] args) {
    String str ="vipulmeshram";
    HashMap<Character,Integer> map= new HashMap<Character,Integer>();
    int [] arr = new int[256];
    for(int i=0; i<str.length();i++){
        arr[str.charAt(i)] +=1;
    }
    int max=-1;
    char c=' ';
    for(int i=0; i<str.length(); i++){
        max =arr[str.charAt(i)];
        c=str.charAt(i);
    }
    System.out.println(c);
    System.out.println(max);



    }
}
