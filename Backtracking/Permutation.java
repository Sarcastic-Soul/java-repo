public class Permutation {
    public static int printPerm(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return 1;
        } else {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char currChar = str.charAt(i);
                String newStr = str.substring(0, i) + str.substring(i + 1);
                count += printPerm(newStr, perm + currChar);
            }
            return count;
        }

    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(printPerm(str, ""));
    }
}
