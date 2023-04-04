package JAVABatch15.class32.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Lava");
        words.add("Computer");

       /* Iterator<String> iterator=words.iterator();

        while(iterator.hasNext()){
            String s=iterator.next();
            if(s.endsWith("a")){
                iterator.remove();
            }
        }*/

        /*for(String s:words){

            if(s.endsWith("a")){
                words.remove(s);
            }
        }*/

      /*  for (int i = 0; i < words.size(); i++) {
            if(words.get(i).endsWith("a")){
                words.remove(i);
            }
        }*/

        words.removeIf(s->s.endsWith("a"));
        System.out.println(words);
    }
}
