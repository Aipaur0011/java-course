package JAVABatch15.class32.class19;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount ba=new BankAccount();
        ba.accountNumber=12345678765434567l;
        ba.money=1000;

        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        System.out.println("====Creating an Object of checking account=======");

        Checking check=new Checking();

        //features from parents
        check.accountNumber=345654;
        check.money=234;
        //features from checking class itself
        check.interest=0;

        check.deposit();//from parents
        check.transfer();//from child
    }

}
