import java.util.*;

public class stackcode {
    
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

          
        while(!st.isEmpty()){
         System.out.println(st.peek());
          st.pop();
        }
    }
    
}
