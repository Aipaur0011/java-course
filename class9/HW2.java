package JAVABatch15.class32.class9;
/*
Create an array of names and store all names of your group.
Then print your name from that array. (use 2 different ways of creating an array).
 */

public class HW2 {
    public static void main(String[] args) {

        String names []={"Elvira", "Aiperi","Tami","Slava", "Daria", "Safi"};

        for(int i=5; i< names.length; i++){
            System.out.println(names[1]);
        }

        System.out.println("************************************************");

        String[] names1=new String[5];

        names1[0]="Elvira";
        names1[1]="Aiperi";
        names1[2]="Tami";
        names1[3]="Slava";
        names1[4]="Daria";
        names1[5]="Safi";

        System.out.println(names1[1]);
    }
}
