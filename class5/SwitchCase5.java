package JAVABatch15.class32.class5;
import java.util.Scanner;

public class SwitchCase5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your Gender  m f");
        char gender=scanner.next().charAt(0);

        //char gender='F';

        switch(gender){

            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified");
        }

    }
}
