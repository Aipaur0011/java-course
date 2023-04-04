package JAVABatch15.class32.class17;
/*
2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
 */

public class Students {

    String name;
    double math;
    double signs;
    double history;
    double average;


    Students(String studentsName, double mathGrade,double signsGrade, double historyGrade) {
        name = studentsName;
        math = mathGrade;
        signs = signsGrade;
        history = historyGrade;
        average = (math + signs + history) / 3;


    }

        void averageGradeInfo(){
            System.out.println(name+" "+average);

    }
}







