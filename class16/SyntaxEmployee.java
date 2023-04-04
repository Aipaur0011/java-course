package JAVABatch15.class32.class16;
/*
Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
 */

public class SyntaxEmployee {

    String empID;
    double salary;
    static String CEO="Sumair";//is going to be same we create this one as static

    public static void main(String[] args) {
        SyntaxEmployee emp1 = new SyntaxEmployee();
        emp1.empID = "S123";
        emp1.salary = 100000;

        SyntaxEmployee emp2 = new SyntaxEmployee();
        emp1.empID = "DF45";
        emp1.salary = 1200000;

    }



}
