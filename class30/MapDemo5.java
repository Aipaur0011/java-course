package JAVABatch15.class32.class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {

        Map<Integer, String> stringMap=new HashMap<>();

        stringMap.put(1,"Aipa");
        stringMap.put(2,"Shah");
        stringMap.put(3,"Tami");
        stringMap.put(4,"Aisha");
        stringMap.put(5,"Gul");
        stringMap.put(6,"Bahar");
        stringMap.put(7,"Saba");

        //remove all the keys from above map if they are gratter than 2

        Set<Integer>allKeys=stringMap.keySet();
        System.out.println(allKeys);

        allKeys.removeIf(x->x>2);
        System.out.println(allKeys);
    }
}
