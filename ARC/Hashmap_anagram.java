import java.util.HashMap;

public class Hashmap_anagram {
    public static void main(String[] args) {

        String str1 = "Silent".toLowerCase();
        String str2 = "listen".toLowerCase();

        int flag = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        if (str1.length() == str2.length()) {
           
            for (int i = 0; i < str1.length(); i++) {
                char key = str1.charAt(i);
                hm.put(key, hm.getOrDefault(key, 0) + 1);
            }

           
            for (int i = 0; i < str2.length(); i++) {
                char key = str2.charAt(i);
                if (!hm.containsKey(key) || hm.get(key) == 0) {
                    flag = 1;
                    break;
                } else {
                    hm.put(key, hm.get(key) - 1);
                }
            }

            

        } else {
            flag = 1; 
        }

        if (flag == 1) {
            System.out.println("Given strings are not anagrams");
        } else {
            System.out.println("Given strings are anagrams");
        }
    }
}
