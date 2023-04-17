import java.util.Stack;

public class reverseStack {

    public static void pushatbottom(int data ,Stack<Integer> S) {
        if(S.isEmpty()){
          S.push(data);
          return;
        }
         int top = S.pop();
         pushatbottom(data, S);
         S.push(top);
 
     }
    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()){
          
            return;
        }
     int top =s.pop();
     reverse(s); 
     pushatbottom(top, s);

 

    }
    public static void main(String[] args) {
   Stack<Integer> s = new Stack<>();
   s.push(1);
   s.push(2);
   s.push(3);
   s.push(4);

  

   // call function 
    reverse(s);
   while(!s.isEmpty()){
    System.out.println(s.peek());
    s.pop();
   }

    }
}
