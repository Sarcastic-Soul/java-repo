public class Recursion3{
    public static int first = -1;
    public static int last = -1;

    public static void Occurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curChar= str.charAt(idx);
        if(curChar== element) {
            if (first == -1) {
                first = idx ;
            } else {
                last = idx;
            }
        }
        Occurance(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "Kya Hua Tera Vada..Wo Kasam Wo Irada...";
        Occurance(str, 0, 'a');
    }
}