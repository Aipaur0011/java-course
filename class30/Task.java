package JAVABatch15.class32.class30;
/*
Create a map of a building. Store floor number and it is associated company name.
 (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */

import java.util.HashMap;

public class Task {
    public static void main(String[] args) {

        HashMap<Integer, String>companies=new HashMap<>();
        companies.put(1,"Google");
        companies.put(2,"Syntax");
        companies.put(3,"Duolingo");
        companies.put(4,"Amazon");
        companies.put(5,"Disney");
        companies.put(6,"TaoBao");
        companies.put(7,"TikTok");

        System.out.println(companies.size());

        companies.replace(4,"Samsung");
        System.out.println(companies);

        companies.remove(7);
        System.out.println(companies);
    }

}
