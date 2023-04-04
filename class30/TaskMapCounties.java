package JAVABatch15.class32.class30;
/*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
 */

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TaskMapCounties {
    public static void main(String[] args) {

        TreeMap<String,String>countries1=new TreeMap<>();
        countries1.put("USA","Washington");
        countries1.put("Russia","Moscow");
        countries1.put("India","NewDelhi");
        countries1.put("Italy","Rome");
        countries1.put("France","Paris");
        countries1.put("UK","London");


        //Set<Map.Entry<String, String>> entrySet=countries1.entrySet();


        //for (Map.Entry<String, String> entry:
            // ) {
           // System.out.println(entry.getKey()+"= "+entry.getValue());
        }

    }


