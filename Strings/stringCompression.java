package DSA.Strings;

public class stringCompression {
    public static void main(String[] args) {

        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        String str = new String(chars);
        int count=1;
        String ans = Character.toString(str.charAt(0));
        for (int i=1; i<str.length(); i++){
            char curr =str.charAt(i);
            char prev =str.charAt(str.length()-1);
            if(curr==prev){
                count++;
            }
            else{
                if(count>1){
                    ans=ans+count;
                    count=1;
                }
                ans=ans+curr;
            }
        }
        if(count>1){
            ans=ans+count;
            count=1;
        }
        System.out.println(ans.length());

    }
}
