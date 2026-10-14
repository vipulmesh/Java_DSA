import java.util.ArrayDeque;
import java.util.Deque;

public class middle_ele {
    public  static void func(Deque<Integer> st, int count , int size){
        //base case 
        if(count==size/2){
            int middleEle =st.peek();
            System.out.println("middle ele from the stack is "+ middleEle);
            return;
        }
        //first case main solve kruga baaki recursion smbhal lega 
        st.pop();
        count++;
        //baki recursion
        func(st, count, size);
    }
 public static void main(String[] args) {
    Deque<Integer> st = new ArrayDeque<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);

    int count =0;
    int size =st.size();
    //i want to print the middle ele;
    func(st, count, size);
 }
    
}