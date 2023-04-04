package JAVABatch15.class32.class9;
/*
Create an array of chars and store grades into it: A,B,C,D,E,F.
Then print a grade B (use 2 different ways of creating an array).
 */
public class HW1 {
    public static void main(String[] args) {

        char letters [] ={'A', 'B', 'C', 'D', 'E', 'F'};

        for(int i=0; i< letters.length; i++){
            System.out.println(letters[1]);
        }
        System.out.println("*********************************************");

        char [] letters1 =new char[6];

        letters1 [0]='A';
        letters1 [1]='B';
        letters1 [2]='C';
        letters1 [3]='D';
        letters1 [4]='E';
        letters1 [5]='F';

        System.out.println(letters[1]);


    }
}

