package JAVABatch15.class32.class11;
/*
 Create a Class “Phone”.
Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.
 */

public class PhoneTester {
    public static void main(String[] args) {

        Phone Iphone=new Phone();

        Iphone.brand="Apple";
        Iphone.model="14ProMax";
        Iphone.color="DeepPurple";
        Iphone.memory=256;
        Iphone.price=1283;

        Iphone.rington();
        Iphone.voice();


        Phone Samsung=new Phone();

        Samsung.brand="Samsung";
        Samsung.model="S22Ultra";
        Samsung.color="Black";
        Samsung.memory=512;
        Samsung.price=1400;

        Samsung.rington();
        Samsung.voice();


        Phone Pixel=new Phone();

        Pixel.brand="Google";
        Pixel.model="7Pro";
        Pixel.color="Red";
        Pixel.memory=256;
        Pixel.price=824;

        Pixel.rington();
        Pixel.voice();

    }
}



