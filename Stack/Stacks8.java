//Prefix & Postfix Expression 
import java.util.Stack;

public class Stacks8 {
    public static void Work(Stack<String> val, Stack<Character> op){
        String v2 = val.pop();
        String v1 = val.pop();
        char o = op.pop();
        String t = o+v1+v2;      //For PostFix--> String t = v1+v2+o;
        val.push(t);
    }

    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){   // '0'-->48 and '9'-->57 ascii values
                String s= ""+ch;
                val.push(s);  
            }     
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
                        //Work
                        Work(val, op);
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
        System.out.println(val.pop());
        
    }
    
}
