import java.util.HashMap;

public class hashmap {
    public static void main(String args[]){
        HashMap<Integer,String>hm = new HashMap<>();

        hm.put(1,"Apple");
        hm.put(2,"Mango");
        hm.put(3,"grapes");
        hm.put(1,"Guava");

       System.out.println(hm.get(1));
       System.out.println(hm.containsKey(3));


    }
    
}
