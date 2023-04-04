package JAVABatch15.class32.class11;

import java.util.Scanner;

public class CatTester {
        public static void main(String[] args) {
                Cat bazooka=new Cat();
                Scanner input=new Scanner(System.in);

                bazooka.name="BumBum";
                bazooka.breed="Piranha";
                bazooka.colour="Red";
                bazooka.attitude="Dangerous";
                bazooka.eat();

                Cat cat2=new Cat();
                cat2.name="loki";
                cat2.breed="Domestic";
                cat2.colour="green";
                cat2.speak();



        }
}

