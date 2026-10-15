import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean checkRedundancy(String s) {
Deque<Character> st = new ArrayDeque<>();

    for(char ch: s.toCharArray()){
        //if ch is the opening bracket or the operator then simply push in the stack
        if(ch=='[' || ch=='(' || ch=='{'){
            st.push(ch);
        }
        else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
            st.push(ch);
        }
        else if(ch=='}' || ch==']' || ch==')'){
            //main logic
            //jb tak mujhe iss stack me iss closing bracket ka corresing
            //opening bracket nahi milta tb tk main pop krte rhuga
            //and track rakhunga k koi operator beech me mila ya nhin

            boolean operatorFound = false;

            while(!st.isEmpty()){
                char temp = st.peek();

                if(temp=='+' || temp=='-' || temp=='*' || temp=='/'){
                    operatorFound = true;
                }

                if(ch=='}' && temp=='{'){
                    st.pop();
                    break;
                }

                if(ch==']' && temp=='['){
                    st.pop();
                    break;
                }

                if(ch==')' && temp=='('){
                    st.pop();
                    break;
                }

                st.pop();
            }

            if(operatorFound == false){
                return true;
            }
        }
    }

    //yahan tak aana means redundant brackes nhin mile
    return false;
}


}
 {
    
}
