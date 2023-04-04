package JAVABatch15.class32.class27;

public class Demo2 {

    public static void main(String[] args) {

        String name="Savo";
        String[] names={"Hiral", "Nima", "Laura", "Nat"};

        //create a method which can search a name from this array return true if name is present in the array
        System.out.println(displayName(name,names));
    }
    public static boolean displayName(String nameOfList,String[] names){
        for(String x: names){
            if(nameOfList.equals(x)){
                return true;
            }
        }
        return false;
    }
}
