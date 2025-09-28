public class FirstUniqueCode {
    
    
    public  static int firstUniqueChar(String s) {
        int[] arr = new int[26]; 

        
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

       
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
       

        String test = "leetcode";
        int index = firstUniqueChar(test);
        System.out.println("First unique character is at index: " + index);  // Should print 0

        String test2 = "aabb";
        int index2 = firstUniqueChar(test2);
        System.out.println("First unique character is at index: " + index2);  // Should print -1
    }
}
