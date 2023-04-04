package JAVABatch15.class32.class5;

public class LogicalOperators2 {
    public static void main(String[] args) {

        /*
        if the score in oll the subjects are  greater than 90 print brilliant student,
        otherwise print you need to work hard
         */

        double mathScore=92.5;
        double historyScore=91.5;
        double scienceScore=93.5;

        if(mathScore>90.0) {
            if (historyScore > 90.0) {
                if (scienceScore > 90.0) {

                    System.out.println("You are a brilliant student");
                } else {
                    System.out.println("You need to work hard");
                }
            } else {
                System.out.println("You need to work hard");
            }
        }else{
                    System.out.println("You need to work hard");
                }
            }

        }

                /*if (mathScore>90&&historyScore>90&&scienceScore>90){
                    System.out.println("You are the brilliant student");
                    }else{
                     System.out.println("You need work harder");
        }

                 */

