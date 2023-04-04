package JAVABatch15.class32.class20;
/*
Create an Employee class that will have variables and methods.
Constructor that should initialize instance variables
Create 2 subclasses FullTime and PartTime Employees that
should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add
some features and methods to the Tester Class.
Test your code!
 */

public class Employee {

    String empName;
    int empID;
    double empSalary;

    Employee(String empName, int empId, double empSalary) {
        this.empName = empName;
        this.empID = empId;
    }

    void print(){
        System.out.println("Employee name is "+empName+"id "+empID+" salary is "+empSalary);
    }
    class FullTime extends Employee{

        String benefits;

        FullTime(String empName, int empId, double salary){
            super(empName, empId, salary);
            this.benefits=benefits;
        }
        void printTwo(){
            System.out.println("Full Time employee will get benefits "+benefits);
        }

    }
    class PartTime extends Employee{

        int time;

        PartTime (String empName,int empId, double salary, int time){
            super(empName,empId,salary);
            this.time=time;
        }
        void printThree(){
            System.out.println("Part Time work will spent just "+time+ " of employees life");
        }


    }}



