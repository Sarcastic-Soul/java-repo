//Infix Expression
import java.util.*;
public class Stacks7 {
    public static void Work(Stack<Integer> val, Stack<Character> op){
        int v2 = val.pop();
        int v1 = val.pop();
        if(op.peek()=='-') val.push(v1-v2);
        if(op.peek()=='+') val.push(v1+v2);
        if(op.peek()=='*') val.push(v1*v2);
        if(op.peek()=='/') val.push(v1/v2);
        op.pop();
    }

    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) val.push(ascii-48);          // '0'-->48 and '9'-->57 ascii values
            else if(op.size()==0 || ch=='(' || op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek() !='('){
                    //Work
                    Work(val, op);
                }
                op.pop(); // '(' Removed
            }
            else{
                if(ch=='+' || ch=='-'){
                    //Work
                    Work(val, op);
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        //Work-special
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek()=='*') val.push(v1*v2);
                        if(op.peek()=='/') val.push(v1/v2);
                        op.pop();
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            //Work
            Work(val, op);
            
        }
        System.out.println(val.peek());
    }
}
