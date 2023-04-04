package JAVABatch15.class32.class4;
//Create a Java program and store values of mortgage rate and mortgage
// price. First, program should check if
// rate is higher than 4.5 user will not buy a house, otherwise user will
// consider buying. Once user decides
// to buy a house, if price of the house is larger than 200000 than user will
// take a loan, otherwise user will pay cash.
//[3:01 PM]
//You are a loan specialist and you need to ask user what is the amount of
// loan is needed. If loan is
// less or equal to 200,000 then you would lend the money otherwise you
// would reject the client.

import java.sql.SQLOutput;

public class HW2 {
    public static void main(String[]agrs){

        double home=4.5;
        int house=200000;
        int loan=200000;

        if(home>4.5){
            System.out.println("They will not buy a house");
        }else{
            System.out.println("They will consider buying");
        }

        if(house>200000){
            System.out.println("They will take a loan");
        }else{
            System.out.println("They will pay cash");
        }
        System.out.println("What is the amount of loan you needed?");

        if(loan>200000){
            System.out.println("You would reject the money");
        }else{
            System.out.println("You would lend the client");
        }
    }


}
