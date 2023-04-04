package JAVABatch15.class32.class2;

public class Variables {
    public static void main(String[] args) {
      /*
      Below line is creating a box in the computer memory.
      We are colling it box1 if we need the info that we are storing inside this box
      we can simply say to the computer give us the contents of box1.
      int=> is the name of the box
      = sign will take whatever we write after it and will store it inside the box1
      10=> is what we  are storing inside the box
       */
        int box1=10;
        // if we are printing something from a box we dont need ""
        System.out.println("box1"); // bring the contents of box1 and print them on the console
        /* to store whole numbers (numbers without decimals points )we have 4 different types of boxes.
        // for examole nembers like 10 20 3000 1000000 330000000
        1) byte 2)short 3) int 4) long
        */
        byte box2=127; // range for byte is from -128 to 127 if we need to store larger numbers we should ter short
        byte box3=-128;
        short box4=32767;
        short box5=-3256;
        int biggerBox=123456484; //most common type of box
        long maxBox=1000000064735765l;

        /*
        Create a box which can hold the number 1000 call in myBox and print its values on the console
         */
        short myBox=10000;
        System.out.println(myBox);

    }
}
