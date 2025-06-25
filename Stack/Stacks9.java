//Conversion of Infix,Postfix,Prefix
import java.util.*;
public class Stacks9 {
    public static void main(String[] args) {
        // Evaluating Postfix
       String postfix = "953+4*6/-";
       Stack<Integer> val = new Stack<Integer>();
       for(int i=0; i<postfix.length();i++){
        char ch = postfix.charAt(i);
        int ascii = (int)ch;
        if(ascii>=48 && ascii<=57) val.push(ascii-48);    // '0'-->48 and '9'-->57 ascii values
        else{
            int v2= val.pop();
            int v1= val.pop();
            if(ch=='+') val.push(v1+v2);
            if(ch=='-') val.push(v1-v2);
            if(ch=='*') val.push(v1*v2);
            if(ch=='/') val.push(v1/v2);
        }
       }
       System.out.println(val.peek());

       //Evaluating Prefix
       String prefix = "-9/*+5346";
       Stack<Integer> value = new Stack<>();
       for(int i=prefix.length()-1; i>=0;i--){
        char ch = prefix.charAt(i);
        int ascii = (int)ch;
        if(ascii>=48 && ascii<=57) value.push(ascii-48);    // '0'-->48 and '9'-->57 ascii values
        else{
            int v1= value.pop();
            int v2= value.pop();
            if(ch=='+') value.push(v1+v2);
            if(ch=='-') value.push(v1-v2);
            if(ch=='*') value.push(v1*v2);
            if(ch=='/') value.push(v1/v2);
        }
       }
       System.out.println(value.peek());

       //Convert Prefix-->Postfix
       Stack<String> st = new Stack<>();
       for(int i=prefix.length()-1; i>=0;i--){
        char ch = prefix.charAt(i);
        int ascii = (int)ch;
        String x = String.valueOf(ch);
        if(ascii>=48 && ascii<=57) st.push(x);
        else{
            String v1 = st.pop();
            String v2 = st.pop();
            String res = v1+v2+x;
            st.push(res);
        }
       }
       System.out.println(st.peek());

       //Convert Postfix-->Prefix
       Stack<String> gt = new Stack<>();
       for(int i=0; i<postfix.length();i++){
        char ch = postfix.charAt(i);
        int ascii = (int)ch;
        String x = String.valueOf(ch);
        if(ascii>=48 && ascii<=57) gt.push(x);
        else{
            String v1 = gt.pop();
            String v2 = gt.pop();
            String res = x+v2+v1;
            gt.push(res);
        }
       }
       System.out.println(gt.peek());

       //Convert Postfix-->Infix
       Stack<String> qt = new Stack<>();
       for(int i=0; i<postfix.length();i++){
        char ch = postfix.charAt(i);
        int ascii = (int)ch;
        String x = String.valueOf(ch);
        if(ascii>=48 && ascii<=57) qt.push(x);
        else{
            String v1 = qt.pop();
            String v2 = qt.pop();
            String res = "("+v2+ch+v1+")";
            qt.push(res);
        }
       }
       System.out.println(qt.peek());

       //Convert Prefix-->Infix
       Stack<String> pt = new Stack<>();
       for(int i=prefix.length()-1; i>=0;i--){
        char ch = prefix.charAt(i);
        int ascii = (int)ch;
        String x = String.valueOf(ch);
        if(ascii>=48 && ascii<=57) pt.push(x);
        else{
            String v1 = pt.pop();
            String v2 = pt.pop();
            String res = "("+v1+ch+v2+")";
            pt.push(res);
        }
       }
       System.out.println(pt.peek());
    }
}