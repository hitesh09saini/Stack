import java.util.Stack;

public class pushbottom {
    public static void pushatbottom(int data ,Stack<Integer> S) {
       if(S.isEmpty()){
         S.push(data);
         return;
       }
        int top = S.pop();
        pushatbottom(data, S);
        S.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);
        
        pushatbottom(4, S);
      while(!S.isEmpty()){
        System.out.println(S.peek());
        S.pop();
      }

    }
}
