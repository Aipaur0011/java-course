package JAVABatch15.class32.class11;
/*
1) Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
Then your program should print name of the students that has A and B grade

 */

public class HW3 {
    public static void main(String[] args) {

        String [][] names={{"Tom", "Bob","Amy","Ali"},
                              { "A", "B", "C", "D"}};


        /*for (int i = 0; i < names.length ; i++) {
            for (int j = 0; j < names[i].length; j++) {
                if(i!=2){

                }
                System.out.println(names[i][j]);*/

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                if((j!=2)&&(j!=3)){
                    System.out.println(names[i][j]);
                }
            }

        }

    }
}
