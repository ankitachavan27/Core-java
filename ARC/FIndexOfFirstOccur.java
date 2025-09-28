public class FIndexOfFirstOccur {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));   
        System.out.println(strStr("aaaaa", "bba"));  
        System.out.println(strStr("abc", ""));       
    }
}
