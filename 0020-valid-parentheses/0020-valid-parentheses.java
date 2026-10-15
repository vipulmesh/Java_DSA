class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(char ch: s.toCharArray()){
           //if this is a open bracket 
           if(ch=='('|| ch=='[' ||  ch=='{'){
            st.push(ch);
           }
           else{
            //if ch is a closing bracket
            // we r going to chk the stack ka top but best prctise whether the stack is empty first

            if(st.isEmpty()){
                return false;
            }
            if(ch==')' && st.peek()!='('){
                return false;
            }
            else if(ch==']' && st.peek()!='['){
                return false;
            }
            else if(ch=='}' && st.peek()!='{'){
                return false;
            }
            else{
                //match wala case
                st.pop();
            }
           }

        }
        //if stack is empty then iska mtlb hai valid expression tha 
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}