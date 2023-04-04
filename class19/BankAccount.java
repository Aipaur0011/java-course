package JAVABatch15.class32.class19;

public class BankAccount {

    long accountNumber;
    double money;

    void deposit(){
        System.out.println("Deposit methods from Bank account class");
    }
}

class Checking extends BankAccount{

    double interest;

    void transfer(){
        System.out.println("transfer methods from Checking account");
    }
}
