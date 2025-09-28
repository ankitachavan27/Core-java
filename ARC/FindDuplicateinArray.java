import java.util.HashMap;

public class FindDuplicateinArray {
    public static void main(String[] args) {
         HashMap<Integer,Integer>hm = new HashMap<>();
         int arr[] ={2,3,2,5,4,3,4};
         for(int i=0;i<arr.length;i++){
            Integer key = arr[i];
            if(!hm.containsKey(key)){
                hm.put(key,1);
            }
            else{
                hm.put(key,hm.get(key)+1);
            }
         }
      System.out.println(hm);
    }
    
}
