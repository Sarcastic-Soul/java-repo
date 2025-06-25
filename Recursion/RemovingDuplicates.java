public class RemovingDuplicates {
    public static boolean[] map = new boolean[26];
    public static void removingDuplicates(String str, int idx, String newString) {
        if (idx == str.length()) {              //Base Case
            System.out.println(newString);
            return;
        }
        char curChar= str.charAt(idx);
        if (map[curChar - 'a'] == true) {
            removingDuplicates(str, idx+1, newString);
        }else {
            newString += curChar;
            map[curChar - 'a'] = true;
            removingDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str= "hfsdghjkasdbf";
        removingDuplicates(str, 0, "");
    }
}
