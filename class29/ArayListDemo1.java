package JAVABatch15.class32.class29;

import java.util.ArrayList;

public class ArayListDemo1 {
    public static void main(String[] args) {

        //Dog dog=new Dog("Bob", "Haski",5);

        ArrayList<Dog>dogs=new ArrayList<>();
        dogs.add(new Dog("Bob", "Haski",5));
        dogs.add(new Dog("Jacky", "German",4));
        dogs.add(new Dog("Jimmi", "BullDog",7));
        dogs.add(new Dog("Mami", "Persian",10));

        for(Dog dogZ:dogs){
            dogZ.printDogNAme();
        }
    }
}
